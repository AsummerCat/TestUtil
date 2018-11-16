package proxytest.cglibproxytest;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 *
 * @author cxc
 * @date 2018/11/16 16:55
 */
public class CglibProxyTest2 implements MethodInterceptor {

    /**
     * 重写方法拦截在方法前和方法后加入业务
     * Object obj为目标对象
     * Method method为目标方法
     * Object[] params 为参数，
     * MethodProxy proxy CGlib方法代理对象
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");
//执行目标对象的方法
        Object returnValue = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理执行结束");
        return returnValue;
    }
}
