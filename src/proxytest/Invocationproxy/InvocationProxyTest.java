package proxytest.Invocationproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * 动态代理类，实现InvocationHandler接口
 *
 * @author cxc
 * @date 2018/11/16 16:14
 */
public class InvocationProxyTest implements InvocationHandler {
    //被代理的类
    private Object target;

    public InvocationProxyTest(Object target) {
        this.target = target;
    }

    //动态生成代理对象
    public Object getInvocationProxyTest() {
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用之前可以做一些处理
        System.out.println("Method before！");
        Object result = method.invoke(target, args);
        //调用之后也可以做一些处理
        System.out.println("Method after！");
        return result;
    }
}
