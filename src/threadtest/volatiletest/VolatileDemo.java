package threadtest.volatiletest;

import java.util.concurrent.TimeUnit;

/**
 * @author cxc
 * @date 2018/11/5 13:00
 */
public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(){
            int i = 0;
            @Override
            public void run(){
                while(!flag){
                }
            }
        };

        t1.start();
        TimeUnit.SECONDS.sleep(1);
        flag = true;
    }

}