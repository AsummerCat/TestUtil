package designmode.prototype;

/**
 * 小鸟类
 * @author cxc
 * @date 2018/11/27 17:16
 */
public class Bird extends Animal {
    public Bird() {
        type = "小鸟";
    }

    @Override
    void draw() {
        System.out.println(type + "小鸟的方法");
    }
}
