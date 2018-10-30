package threadtest.cache;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cxc
 * @date 2018/10/29 17:34
 * 多线程缓存池
 */
public class ThreadPoolNewCache {
    public static void main(String[] args) {
        //使用Executors 创建一个缓存线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            executorService.submit(new MyRunnableCache(String.valueOf(i)));
        }
    }
}
