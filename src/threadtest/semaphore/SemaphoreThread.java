package threadtest.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author cxc
 * @date 2018/11/1 13:29
 * 线程类测试信号量
 */
public class SemaphoreThread implements Runnable {
    private Semaphore semaphore;
    private Integer num;

    public SemaphoreThread(Semaphore semaphore, Integer num) {
        this.semaphore = semaphore;
        this.num = num;
    }

    @Override
    public void run() {
        try {
            //获取一个许可
            semaphore.acquire();
            System.out.println("运行中--->" + num);
            Thread.sleep(1000);
            System.out.println("运行结束--->" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //需要释放许可
            semaphore.release();
        }
    }
}
