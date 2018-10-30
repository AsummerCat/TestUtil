package listanalyze;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author cxc
 * @date 2018/10/30 17:29
 * 队列的简单使用
 * 需要注意事项: 队列没有值的话 element()丶remove()会报错,而 poll()丶peek()不会报错
 * Exception in thread "main" java.util.NoSuchElementException;
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //入队
        //添加 add()
        queue.poll();
        queue.add(1);
        queue.add(2);
        boolean add = queue.add(3);
        queue.forEach(data -> System.out.println("初次返回结果:--->" + data));

        //添加成功 有返回值 offer()
        boolean offer = queue.offer(4);
        boolean offer1 = queue.offer(5);
        boolean offer2 = queue.offer(6);
        queue.forEach(data -> System.out.println("再次返回结果:--->" + data));

        System.out.println("------------------------");
        //获取第一个元素并删除
        //方法 poll()    让第一个元素出队
        System.out.println("poll=" + queue.poll());
        queue.forEach(data -> {
            System.out.println("初次poll后剩下:-->" + data);
        });
        System.out.println("------------------------");
        //获取第一个元素并删除
        //方法 remove()    让第一个元素出队
        System.out.println("remove=" + queue.remove());
        queue.forEach(data -> {
            System.out.println("初次remove后剩下:-->" + data);
        });
        System.out.println("------------------------");
        //查看第一个元素 不出队
        //方法 peek()
        System.out.println("peek=" + queue.peek());
        queue.forEach(data -> {
            System.out.println("初次peek后剩下:-->" + data);
        });
        System.out.println("------------------------");
        //查看第一个元素 不出队
        //方法 element()
        System.out.println("element=" + queue.element());
        queue.forEach(data -> {
            System.out.println("初次element后剩下:-->" + data);
        });
        System.out.println("------------------------");
    }


}
