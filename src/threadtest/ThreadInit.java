package threadtest;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author cxc
 * @date 2018/10/29 16:12
 * 创建线程的三种方式
 */
public class ThreadInit {
    public static void main(String[] args) {

        Callable<Object> oneCallable = new threadtest.MyCallable("小明");
        FutureTask<Object> oneTask = new FutureTask<Object>(oneCallable);
        //注释：FutureTask<Integer>是一个包装器，它通过接受Callable<Integer>来创建，它同时实现了Future和Runnable接口。
        Thread oneThread = new Thread(oneTask);
        oneThread.start();
    }


    /**
     * 第一种继承 Thread类
     */
    class MyThread extends Thread {

        private int i = 0;

        @Override
        public void run() {
            for (i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

    /**
     * 实现Runnable 接口
     */
    class MyRunnable implements Runnable {
        private int i = 0;

        @Override
        public void run() {
            for (i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }


    /**
     * 实现Callable接口
     */
    class MyCallable implements Callable<Object> {
        private String name;

        public MyCallable() {
        }

        public MyCallable(String name) {
            this.name = name;
        }

        @Override
        public Object call() throws Exception {
            System.out.println(">>>" + name + "任务启动");
            Date dateTmp1 = new Date();
            Thread.sleep(1000);
            Date dateTmp2 = new Date();
            long time = dateTmp2.getTime() - dateTmp1.getTime();
            System.out.println(">>>" + name + "任务终止");
            return name + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
        }
    }



}
