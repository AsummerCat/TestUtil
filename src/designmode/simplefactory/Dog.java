package designmode.simplefactory;

/**
 * 小狗
 *
 * @author cxc
 * @date 2018/11/24 22:44
 */
public class Dog extends Animal {
    static {
        System.out.println("我是小狗");
    }

    @Override
    public void eat() {
        System.out.println("我吃肉");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}
