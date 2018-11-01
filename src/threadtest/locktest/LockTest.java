package threadtest.locktest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cxc
 * @date 2018/11/1 15:24
 * lock
 */
public class LockTest {
    private String name;
    private Lock lock = new ReentrantLock();

    public LockTest(String name) {
        this.name = name;
    }


    //lock 和trylock
    public void method() {
        System.out.println("进入");
        if (lock.tryLock()) {
            try {
                System.out.println("休息2秒");
                Thread.sleep(2000);
                System.out.println("结束");
            } catch (InterruptedException e) {
                e.getLocalizedMessage();
            } finally {
                //lock.unlock();
            }
        } else {
            System.out.println("没有获取到锁");
        }
    }

    //lockInterruptibly中断等待
    public void method1() {

        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("进入");
        try {
            System.out.println("休息2秒");
            Thread.sleep(2000);
            System.out.println("结束");
        } catch (InterruptedException e) {
            e.getLocalizedMessage();
        } finally {
            lock.unlock();
        }
    }
}
