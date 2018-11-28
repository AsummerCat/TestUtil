package threadtest.single;

/**
 * @author cxc
 * @date 2018/10/29 17:31
 * 单线程线程池 的线程类
 */
public class MyRunnableSingle implements Runnable {
    private String name;

    public MyRunnableSingle(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("-->>>>单线程数线程池" + name + "开始");
        try {
            Thread.sleep(2000);
           int i=5/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-->>>>单线程数线程池" + name + "结束");
    }
}
