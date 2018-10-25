package listanalyze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author cxc
 * @date 2018/10/24 11:53
 * 集合添加比较
 */
public class ArrayLIstAndLinkedListInsert {
    private static int num = 50000;

    public static void main(String[] args) {
        List a = new ArrayList(num);
        System.out.println("ArrayList插入" + num + "记录耗时" + addArrayListTime(a) + "毫秒");
        List b = new LinkedList();
        System.out.println("LinkedList插入" + num + "记录耗时" + addLinkedListTime(b) + "毫秒");
    }

    /**
     * 添加Arraylist数组
     */
    static long addArrayListTime(List list) {
        Random r = new Random();
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            list.add(r.nextInt(i + 1), i);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * 添加Linkedlist数组
     */
    static long addLinkedListTime(List list) {
        Random r = new Random();
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            list.add(r.nextInt(i + 1), i);
        }
        return System.currentTimeMillis() - startTime;
    }

}
