package threadtest.countdownlatchtest;

import java.util.concurrent.CountDownLatch;

/**
 * @author cxc
 * @date 2018/11/1 22:55
 * CountDownLatch线程测试类     等待
 */
public class CountDownLatchThread implements Runnable {
    private CountDownLatch countDownLatch;
    private String name;

    public CountDownLatchThread(CountDownLatch countDownLatch, String name) {
        this.countDownLatch = countDownLatch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("我准备好了->" + name);
            //等待其他执行完毕通知运行
            System.out.println("我开始等待了->" + name);
            countDownLatch.await();
            System.out.println("我们出发吧->" + name);
        } catch (InterruptedException e) {
            e.getLocalizedMessage();
        }
    }
}
