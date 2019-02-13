package myTreeMap;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/**
 * @author cxc
 * @date 2019/2/13 11:09
 */
public class MyTreeMap<K, V> extends AbstractMap<K, V> implements Cloneable, java.io.Serializable {

    /**
     * 序列化
     */
    private static final long serialVersionUID = 4318938644099875798L;


    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>基本参数
     * ########################################################################################################
     */


    //选择排序方式 默认为用于维护树映射中顺序的比较器，或者如果使用其键的自然顺序，则为空
    private final Comparator<? super K> comparator;

    //root 是红黑数的根节点
    private transient Entry<K, V> root;

    /**
     * 红黑树节点个数
     */
    private transient int size = 0;

    /**
     * 修改tree次数
     */
    private transient int modCount = 0;

    //红黑树的节点颜色--红色
    private static final boolean RED = false;
    //红黑树的节点颜色--黑色
    private static final boolean BLACK = true;


    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>构造方法
     * ########################################################################################################
     */
    //默认构造 按照key自然排序
    public MyTreeMap() {
        this.comparator = null;
    }

    // 按照排序器排序
    public MyTreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }

    //创建的TreeMap包含Map
    public MyTreeMap(Map<? extends K, ? extends V> m) {
        comparator = null;
        putAll(m);
    }


    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>节点信息(红黑树)
     * ########################################################################################################
     */

    static final class Entry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;
        Entry<K, V> left;
        Entry<K, V> right;
        Entry<K, V> parent;
        boolean color = BLACK;


        Entry(K key, V value, Entry<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;

            return valEquals(key, e.getKey()) && valEquals(value, e.getValue());
        }

        @Override
        public int hashCode() {
            int keyHash = (key == null ? 0 : key.hashCode());
            int valueHash = (value == null ? 0 : value.hashCode());
            return keyHash ^ valueHash;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    //测试两个值是否相等。与o1不同。仅等于（o2）
    static final boolean valEquals(Object o1, Object o2) {
        return (o1 == null ? o2 == null : o1.equals(o2));
    }

    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>
     * ########################################################################################################
     */


    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override
    public V get(Object key) {
        return super.get(key);
    }

    @Override
    public V put(K key, V value) {
        //获取根节点
        Entry<K, V> t = root;
        //如果根节点为空
        if (t == null) {
            //类型检查
            compare(key, key);
            //赋值根节点
            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        //key值排序的位置
        int cmp;
        //定义一个根节点
        Entry<K, V> parent;
        //赋值排序器
        Comparator<? super K> cpr = comparator;

        //如果有排序器的话 进行排序 do while 遍历到 左或右节点 也就是最底部的父节点
        if (cpr != null) {
            do {
                parent = t;
                //用排序器判断 比较新增节点的key和当前节点key的大小
                cmp = cpr.compare(key, t.key);
                //cmp返回值小于0，表示新增节点的key小于当前节点的key，则以当前节点的左子节点作为新的当前节点
                if (cmp < 0) {
                    t = t.left;
                }
                //cmp返回值大于0，表示新增节点的key大于当前节点的key，则以当前节点的右子节点作为新的当前节点
                else if (cmp > 0) {
                    t = t.right;
                }
                //还有一种情况等于根节点 那就直接赋值
                //cmp返回值等于0，表示两个key值相等，则新值覆盖旧值，并返回新值
                else {
                    return t.setValue(value);
                }
            } while (t != null);
        }
        //如果没有排序器 直接利用key自然排序
        else {
            if (key == null) {
                throw new NullPointerException();
            }
            @SuppressWarnings("unchecked")
            Comparable<? super K> k = (Comparable<? super K>) key;
            //循环操作是一样的
            do {
                parent = t;
                cmp = k.compareTo(t.key);
                if (cmp < 0) {
                    t = t.left;
                } else if (cmp > 0) {
                    t = t.right;
                } else {
                    return t.setValue(value);
                }
            } while (t != null);
        }

        //最后创建 一个节点
        Entry<K, V> e = new Entry<>(key, value, parent);
        //在根据位置 插入 左或者右
        if (cmp < 0) {
            parent.left = e;
        } else {
            parent.right = e;
        }
        //插入后固定位置 也就是进行自旋
        // 上面已经完成了排序二叉树的的构建，将新增节点插入该树中的合适位置
        // 下面fixAfterInsertion()方法就是对这棵树进行调整、平衡，具体过程参考上面的五种情况
        //涉及红黑树的左旋、右旋、着色三个基本操作
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }

    @Override
    public V remove(Object key) {
        return super.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        super.putAll(m);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public Set<K> keySet() {
        return super.keySet();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }


    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>内部方法
     * ########################################################################################################
     */
    //使用此树映射的正确比较方法比较两个键。
    @SuppressWarnings("unchecked")
    final int compare(Object k1, Object k2) {
        return comparator == null ? ((Comparable<? super K>) k1).compareTo((K) k2)
                : comparator.compare((K) k1, (K) k2);
    }


    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>红黑树节点 进行调整、平衡
     * ########################################################################################################
     */
    /**
     * 红黑树节点调整
     * 进行调整、平衡
     */
    private void fixAfterInsertion(Entry<K, V> x) {
        //首先标记添加节点为红
        x.color = RED;

        //循环 直到 x不是根节点，且x的父节点不为红色
        while (x != null && x != root && x.parent.color == RED) {

            //当前节点的父节点 == 当前节点父节点的父节点的左边节点 不需要注意空值的情况
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
            //获取X的叔节点(U)
                Entry<K, V> y = rightOf(parentOf(parentOf(x)));
                //如果X的叔节点（U） 为红色
                if (colorOf(y) == RED) {
                    //将X的父节点（P）设置为黑色
                    setColor(parentOf(x), BLACK);
                    //将X的叔节点（U）设置为黑色
                    setColor(y, BLACK);
                    //将X的父节点的父节点（G）设置红色
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                }
                else {
                    if (x == rightOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            }

            //父节点!=当前节点父节点的父节点的左边节点
            else {
                Entry<K, V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }

        root.color = BLACK;
    }


    private static <K, V> Entry<K, V> leftOf(Entry<K, V> p) {
        return (p == null) ? null : p.left;
    }

    private static <K, V> Entry<K, V> rightOf(Entry<K, V> p) {
        return (p == null) ? null : p.right;
    }

    private static <K, V> boolean colorOf(Entry<K, V> p) {
        return (p == null ? BLACK : p.color);
    }

    private static <K, V> Entry<K, V> parentOf(Entry<K, V> p) {
        return (p == null ? null : p.parent);
    }

    private static <K, V> void setColor(Entry<K, V> p, boolean c) {
        if (p != null) {
            p.color = c;
        }
    }

    private void rotateLeft(Entry<K, V> p) {
        if (p != null) {
            Entry<K, V> r = p.right;
            p.right = r.left;
            if (r.left != null) {
                r.left.parent = p;
            }
            r.parent = p.parent;
            if (p.parent == null) {
                root = r;
            } else if (p.parent.left == p) {
                p.parent.left = r;
            } else {
                p.parent.right = r;
            }
            r.left = p;
            p.parent = r;
        }
    }

    private void rotateRight(Entry<K, V> p) {
        if (p != null) {
            Entry<K, V> l = p.left;
            p.left = l.right;
            if (l.right != null) {
                l.right.parent = p;
                l.parent = p.parent;
            }
            if (p.parent == null) {
                root = l;
            } else if (p.parent.right == p) {
                p.parent.right = l;
            } else {
                p.parent.left = l;
            }
            l.right = p;
            p.parent = l;
        }
    }

    /**
     * ########################################################################################################
     * >>>>>>>>>>>>>>>基本方法
     * ########################################################################################################
     */

    @Override
    public int size() {
        return size;
    }


}
