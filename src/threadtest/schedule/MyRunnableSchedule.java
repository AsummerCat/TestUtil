package threadtest.schedule;

/**
 * @author cxc
 * @date 2018/10/29 17:31
 * 定长任务线程池 的线程类
 */
public class MyRunnableSchedule implements Runnable {
    private String name;

    public MyRunnableSchedule(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("-->>>>定长任务线程池" + name + "延迟3秒开始");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-->>>>定长任务线程池" + name + "结束");
    }
}
