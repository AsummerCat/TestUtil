package threadtest.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author cxc
 * @date 2018/11/1 22:55
 * CyclicBarrier线程测试类     等待
 */
public class CyclicBarrierThread implements Runnable {
    private CyclicBarrier cyclicBarrier;
    private String name;

    public CyclicBarrierThread(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("我准备好了->" + name);
            //等待其他执行完毕通知运行
            System.out.println("我开始等待了->" + name);
            cyclicBarrier.await();
            System.out.println("我们出发吧->" + name);
        } catch (BrokenBarrierException e) {
            e.getLocalizedMessage();
        } catch (InterruptedException e) {
            e.getLocalizedMessage();
        }
    }
}
