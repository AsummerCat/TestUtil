package threadtest.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cxc
 * @date 2018/11/5 14:07
 * CyclicBarrier 回环栅栏
 */
public class CyclicBarrierTest {
    static int n=5;
    static final CyclicBarrier cyclicBarrier = new CyclicBarrier(n);

    public static void main(String[] args) {
        //小明和小强在等待5个人的车子开出去后出发   这边使用 await() 等待
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new CyclicBarrierThread(cyclicBarrier, "小明"));
        executorService.execute(new CyclicBarrierThread(cyclicBarrier, "小强"));
        executorService.execute(new CyclicBarrierThread(cyclicBarrier, "小1"));
        executorService.execute(new CyclicBarrierThread(cyclicBarrier, "小2"));
        executorService.execute(new CyclicBarrierThread(cyclicBarrier, "小3"));
        //executorService.execute(new CyclicBarrierThread(cyclicBarrier, "小4"));
    }
}
