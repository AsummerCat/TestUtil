package threadtest.schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author cxc
 * @date 2018/10/29 17:49
 * 定长线程数任务的线程池 支持定时 周期性
 */
public class ThreadPoolSchedule {
    public static void main(String[] args) {
        //这里需要注意的是不能向上转型 因为没有schedule方法
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        //延时执行  schedule方法
        scheduledExecutorService.schedule(new MyRunnableSchedule("延时"), 3, TimeUnit.SECONDS);

        //周期性延时执行  scheduleAtFixedRate方法
        scheduledExecutorService.scheduleAtFixedRate(new MyRunnableSchedule("定时"), 1, 3, TimeUnit.SECONDS);


    }
}
