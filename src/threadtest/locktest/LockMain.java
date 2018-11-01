package threadtest.locktest;

/**
 * @author cxc
 * @date 2018/11/1 15:29
 * lock测试类
 */
public class LockMain {
    public static void main(String[] args) throws InterruptedException {
        LockTest lockTest = new LockTest("小明");
        new Thread() {
            @Override
            public void run() {
                lockTest.method();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                lockTest.method();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                lockTest.method();
            }
        }.start();


        new Thread() {
            @Override
            public void run() {
                lockTest.method1();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                lockTest.method1();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                lockTest.method1();
            }
        }.start();
    }
}
