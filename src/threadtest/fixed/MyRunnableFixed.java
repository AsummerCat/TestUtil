package threadtest.fixed;

/**
 * @author cxc
 * @date 2018/10/29 17:31
 * 固定线程数线程池 的线程类
 */
public class MyRunnableFixed implements Runnable {
    private String name;

    public MyRunnableFixed(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("-->>>>固定线程数线程池" + name + "开始");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-->>>>固定线程数线程池" + name + "结束");
    }
}
