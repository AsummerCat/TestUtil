package maptest;

import java.util.*;

/**
 * @author cxc
 * @date 2018/10/27 15:53
 * HashMap与HashTable 区别
 * hashTable 线程安全 synchronized  键值对都不为空 因为key为null  算不出hash 就抛出了NPE
 * hashMap 线程不安全 key可以为null  如果为null hash会被被默认计算为0
 */
public class HashMapAndHashTable {
    public static void main(String[] args) {
        try {
            hashMapAdd();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("HashMap操作失败");
        }
        try {
            hashTableAdd();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("HashTable操作失败");
        }
    }

    /**
     * 创建hashMap
     */
    private static void hashMapAdd() {
        Map map = new HashMap<>();
        map.put(null, 1);
        Collection values = map.values();
        values.forEach(data -> System.out.println("hashMap的值:" + data.toString()));
        Set set = map.entrySet();
        set.forEach(data -> System.out.println("hashMap的key:" + data));
    }

    /**
     * 创建HashTable
     */
    private static void hashTableAdd() {
        Map map = new Hashtable<>();
        map.put("测试", 1);
        Collection values = map.values();
        values.forEach(data -> System.out.println("HashTable值:" + data.toString()));
        Set set = map.entrySet();
        set.forEach(data -> System.out.println("HashTable的key:" + data));
    }


}
