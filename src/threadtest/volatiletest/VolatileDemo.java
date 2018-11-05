package threadtest.volatiletest;

import java.util.concurrent.TimeUnit;

/**
 * @author cxc
 * @date 2018/11/5 13:00
 * 使用volatile程序会终止
 */
public class VolatileDemo {
    private static boolean flag = false;
    //如果不使用volatile 程序不会终止 会有一个副本
    //private static  boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (!flag) {
                }
            }
        };

        t1.start();
        TimeUnit.SECONDS.sleep(1);
        flag = true;
    }

}