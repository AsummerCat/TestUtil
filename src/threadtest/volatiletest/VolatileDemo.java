package threadtest.volatiletest;

/**
 * @author cxc
 * @date 2018/11/5 13:00
 */
public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!flag) {
                        System.out.println("未选中");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("结束");
                }
            }).start();
        }

        System.out.println("--->主线程 修改flag");
        flag=true;
    }
}
