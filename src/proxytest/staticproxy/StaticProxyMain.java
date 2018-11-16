package proxytest.staticproxy;

/**
 * @author cxc
 * @date 2018/11/16 14:56
 */
public class StaticProxyMain {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new HelloImpl());
        staticProxy.save();
    }
}
