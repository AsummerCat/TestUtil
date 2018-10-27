package maptest;

import java.util.*;

/**
 * @author cxc
 * @date 2018/10/27 16:46
 * HashMap 的key是无序的
 * treeMap 的key是有序的
 * Set entries = map.entrySet();遍历键值对
 */
public class HashMapAndTreeMap {
public static void main(String[] args){
     hashMapAdd();
     treeMapAdd();
}

    /**
     * hashMap遍历
     */
    private static void hashMapAdd() {
            Random random=new Random();
        HashMap<String,Integer> map=new HashMap<>();
        int num=1000;
        for (int i = 0; i < num; i++) {
            map.put(Integer.toString(random.nextInt(1000)),i);
        }
        Set entries = map.entrySet();
        entries.forEach(data -> System.out.println("hashMap的值:" + data.toString()));

    }

    /**
     * treeMap遍历
     */
    private static void treeMapAdd() {
        Random random=new Random();
        TreeMap<String,Integer> map=new TreeMap<>();
        int num=1000;
        for (int i = 0; i < num; i++) {
            map.put(Integer.toString(random.nextInt(1000)),i);
        }
        Set entries = map.entrySet();
        entries.forEach(data -> System.out.println("treeMap的值:" + data.toString()));
    }
}
