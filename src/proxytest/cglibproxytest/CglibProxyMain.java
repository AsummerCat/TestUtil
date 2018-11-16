package proxytest.cglibproxytest;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 *
 * @author cxc
 * @date 2018/11/16 16:55
 */
public class CglibProxyMain {
    public static void main(String[] args) {
        //两种实现方式

        //方式一
        test1();
        //方式二
        test2();
    }


    private static void test1() {
        //目标对象
        UserDao target = new UserDao();
        //代理对象
        UserDao proxy = (UserDao) new CglibProxyTest(target).getProxyInstance();

        proxy.save();
    }

    private static void test2() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(UserDao.class);
        //3.设置回调函数
        en.setCallback(new CglibProxyTest2());
        //4.创建子类(代理对象)
        UserDao target = (UserDao) en.create();

        target.save();
    }
}
