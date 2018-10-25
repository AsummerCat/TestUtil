package listanalyze;

import java.util.*;

/**
 * @author cxc
 * @date 2018/10/24 11:53
 * 集合查找比较
 */
public class ArrayLIstAndLinkedListDelete {
    private static int num = 500000;

    public static void main(String[] args) {
        List a = new ArrayList(num);
        addListTime(a);
        List b = new LinkedList();
        addListTime(b);

        System.out.println("ArrayList删除全部" + num + "记录耗时" + deleteList(a) + "毫秒");

        System.out.println("LinkedList删除全部" + num + "记录耗时" + deleteList(b) + "毫秒");
    }

    /**
     * 删除list数组
     */
    public static long deleteList(List list) {
        Long startTime = System.currentTimeMillis();
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        return System.currentTimeMillis() - startTime;
    }


    /**
     * 添加list数组
     */
    static long addListTime(List list) {
        Random r = new Random();
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            list.add(r.nextInt(i + 1), i);
        }
        return System.currentTimeMillis() - startTime;
    }

}
