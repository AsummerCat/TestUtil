package threadtest;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * 实现Callable接口
 */
class MyCallable implements Callable<Object> {
    private String name;

    public MyCallable() {
    }

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(">>>" + name + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + name + "任务终止");
        return name + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}