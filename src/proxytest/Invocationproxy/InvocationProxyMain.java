package proxytest.Invocationproxy;

/**
 * 动态代理
 * @author cxc
 * @date 2018/11/16 16:14
 */
public class InvocationProxyMain {
    public static void main(String[] args) {
        //需要注意的是 这里需要添加 接口类 不能写实体类 不然会出现
        //com.sun.proxy.$Proxy0 cannot be cast to Father

        Animal cat = (Animal) new InvocationProxyTest(new Cat()).getInvocationProxyTest();
        cat.save();
        cat.del();

        Animal dog = (Animal) new InvocationProxyTest(new Dog()).getInvocationProxyTest();
        dog.save();
        dog.del();
    }
}
