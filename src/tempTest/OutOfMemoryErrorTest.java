package tempTest;

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
public class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 1; i < 1000; i++) {
            list.add(i);
        }
        test();
        System.out.println(list.size());
    }

    static void test() {
        List list = new ArrayList();
        for (int i = 1; i < 10000000; i++) {
            System.out.println(1);
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
            list.add(new String("1"));
        }
        list.size();
    }
}
