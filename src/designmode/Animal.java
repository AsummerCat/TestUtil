package designmode;

/**
 * 动物抽象类
 *
 * @author cxc
 * @date 2018/11/24 22:42
 */
public abstract class Animal {
    static {
        System.out.println("动物工厂开始运作了");
    }

    public abstract void eat();

    public abstract void shout();
}
