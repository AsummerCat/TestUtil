package threadtest.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author cxc
 * @date 2018/11/1 13:28
 * 信号量
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        //非公平锁  默认是非公平锁
        //Semaphore semaphore = new Semaphore(5,false);
        //公平锁  公平锁
        Semaphore semaphore = new Semaphore(5, true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        int n = 50;
        for (int i = 0; i < n; i++) {
            executorService.execute(new SemaphoreThread(semaphore, i));
        }

    }
}
