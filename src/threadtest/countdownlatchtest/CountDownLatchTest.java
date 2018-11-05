package threadtest.countdownlatchtest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cxc
 * @date 2018/11/1 22:54
 * CountDownLatch测试  (等待集合 然后执行)
 */
public class CountDownLatchTest {
    //创建一个有初始值的记数阀门
    static final CountDownLatch countDownLatch = new CountDownLatch(5);

    public static void main(String[] args) {
        //小明和小强在等待5个人的车子开出去后出发   这边使用 await() 等待
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new CountDownLatchThread(countDownLatch, "小明"));
        executorService.execute(new CountDownLatchThread(countDownLatch, "小强"));
        //这边 countDown 执行
        executorService.execute(new CountDownLatchThread1(countDownLatch, "小西"));
        executorService.execute(new CountDownLatchThread1(countDownLatch, "小黑"));
        executorService.execute(new CountDownLatchThread1(countDownLatch, "小白"));
        executorService.execute(new CountDownLatchThread1(countDownLatch, "小绿"));
        executorService.execute(new CountDownLatchThread1(countDownLatch, "小美"));
    }
}
