package proxytest.staticproxy;

/**
 * 工厂类
 * 代理对象,静态代理
 *
 * @author cxc
 * @date 2018/11/16 14:51
 */
public class StaticProxy implements Hello {
    //需要代理的类(目标类)
    private HelloImpl hello;

    //使用构造函数代理
    public StaticProxy(HelloImpl hello) {
        this.hello = hello;
    }

    public void before() {
        System.out.println("被我静态代理了");
    }

    public void after() {
        System.out.println("代理成功");
    }

    @Override
    public void save() {
        before();
        hello.save();
        after();
    }
}
