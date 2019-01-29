package myList;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author cxc
 * @date 2019/1/23 16:17
 */
public class MyArrayListMain {
    public static void main(String[] args) {
        //ArrayList<Object> list = new ArrayList<>(-1);
        //list.parallelStream();
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.peek();
        //
        //list.add(1);
        //list.get(1);
        //list.remove(1);
        MyArrayList<Object> list = new MyArrayList<>(1);
        list.add(1);
        list.add(null);

    }
}
