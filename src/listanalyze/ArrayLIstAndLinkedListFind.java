package listanalyze;

import java.util.*;

/**
 * @author cxc
 * @date 2018/10/24 11:53
 * 集合查找比较
 */
public class ArrayLIstAndLinkedListFind {
    private static int num = 50000;

    public static void main(String[] args) {
        List a = new ArrayList(num);
        addListTime(a);
        List b = new LinkedList();
        addListTime(b);

        System.out.println("ArrayList查找全部" + num + "记录耗时" + findList(a) + "毫秒");

        System.out.println("LinkedList查找全部" + num + "记录耗时" + findList(b) + "毫秒");
    }

    /**
     * 遍历list数组
     */
    public static long findList(List list) {
        Long startTime = System.currentTimeMillis();
        for (int i = 0, j = list.size(); i < j; i++) {
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
