package threadtest.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cxc
 * @date 2018/10/29 17:49
 * 单线程数的线程池
 */
public class ThreadPoolSingle {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        int n = 100;
        for (int i = 0; i < n; i++) {
            executorService.execute(new MyRunnableSingle(String.valueOf(i)));
        }
    }
}
