package threadtest.countdownlatchtest;

import java.util.concurrent.CountDownLatch;

/**
 * @author cxc
 * @date 2018/11/1 22:55
 *  CountDownLatch线程测试类     直接执行
 */
public class CountDownLatchThread1 implements Runnable{
    private CountDownLatch countDownLatch;
    private String name;

    public CountDownLatchThread1(CountDownLatch countDownLatch, String name) {
        this.countDownLatch = countDownLatch;
        this.name = name;
    }

    @Override
    public void run() {
            System.out.println(name+"的车子开出去了");
            //执行成功 减1
             countDownLatch.countDown();
    }
}
