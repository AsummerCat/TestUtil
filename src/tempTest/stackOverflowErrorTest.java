package tempTest;

/**
 * 堆栈错误
 * Exception in thread "main" java.lang.StackOverflowError
 * 场景 : 在递归调用 可能会出现 无限调用自己
 * 说明: 如果线程请求的栈深度大于JVM允许的栈深度，将抛出StackOverflowError异常。
 * @author cxc
 * @date 2018/12/7 11:27
 */
public class stackOverflowErrorTest {
    public static void main(String[] args){
        test();
    }

     static void test(){
        test();
    }
}
