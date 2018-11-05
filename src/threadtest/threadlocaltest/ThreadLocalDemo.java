package threadtest.threadlocaltest;

/**
 * @author cxc
 * @date 2018/11/5 13:17
 */
public class ThreadLocalDemo {
    private static ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
    private static int num=1;

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("添加第一个:"+num);
                    threadLocal.set(num+1);
                    System.out.println("测试第一个"+threadLocal.get());
                    threadLocal.remove();
                }
            }).start();
        }
    }
}
