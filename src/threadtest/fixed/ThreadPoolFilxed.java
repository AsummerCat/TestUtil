package threadtest.fixed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cxc
 * @date 2018/10/29 17:49
 * 指定线程数的线程池 ,空闲不会释放资源
 */
public class ThreadPoolFilxed {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        int n = 100;
        for (int i = 0; i < n; i++) {
            executorService.execute(new MyRunnableFixed(String.valueOf(i)));

        }
    }
}
