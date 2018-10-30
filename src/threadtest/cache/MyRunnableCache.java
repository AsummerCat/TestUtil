package threadtest.cache;

/**
 * @author cxc
 * @date 2018/10/29 17:31
 * 缓存线程池 的线程类
 */
public class MyRunnableCache implements Runnable {
    private String name;

    public MyRunnableCache(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("-->>>>缓存线程池" + name + "开始");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-->>>>缓存线程池" + name + "结束");
    }
}
