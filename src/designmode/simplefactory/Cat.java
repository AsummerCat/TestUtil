package designmode.simplefactory;

/**
 * 小猫
 * @author cxc
 * @date 2018/11/24 22:44
 */
public class Cat extends Animal {
    static {
        System.out.println("我是小猫咪");
    }

    @Override
    public void eat() {
        System.out.println("我吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
