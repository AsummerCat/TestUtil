package tempTest;

import designmode.observer.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆栈错误
 * Exception in thread "main" java.lang.OutOfMemoryError
 * 场景 : 内存溢出 当前虚拟机堆内存溢出
 * 说明: 如果jvm可以动态扩展，如果扩展时无法申请到足够的内存，就会抛出OutOfMemoryError异常。
 *
 * @author cxc
 * @date 2018/12/7 11:27
 */
public class OutOfMemoryErrorTest1 {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        List list = new ArrayList();
        for (int i = 1; i < 100; i++) {
           User A =new User(Integer.toString(i));
           list.add(A);
           A=null;

        }
        list.forEach(System.out::println);
    }
}
