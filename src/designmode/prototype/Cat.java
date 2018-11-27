package designmode.prototype;

/**
 * 小猫类
 * @author cxc
 * @date 2018/11/27 17:16
 */
public class Cat extends Animal {
    public Cat() {
        type = "小猫";
    }

    @Override
    void draw() {
        System.out.println(type + "小猫咪的方法");
    }
}
