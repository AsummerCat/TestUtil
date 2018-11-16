package proxytest.Invocationproxy;

/**
 * 代理类
 *
 * @author cxc
 * @date 2018/11/16 16:10
 */
public class Cat implements Animal {

    @Override
    public void save() {
        System.out.println("保存一个小猫");
    }

    @Override
    public void del() {
        System.out.println("删除一个小猫");
    }
}
