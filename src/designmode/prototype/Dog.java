package designmode.prototype;

/**
 * 小狗类
 *
 * @author cxc
 * @date 2018/11/27 17:16
 */
public class Dog extends Animal {
    public Dog() {
        type = "小狗";
    }

    @Override
    void draw() {
        System.out.println(type + "小狗的方法");
    }
}
