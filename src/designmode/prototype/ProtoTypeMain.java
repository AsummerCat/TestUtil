package designmode.prototype;

/**
 * 原型模式 测试类
 *
 * @author cxc
 * @date 2018/11/27 17:20
 */
public class ProtoTypeMain {
    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal clone = (Animal) bird.clone();

        //需要注意的是 这里只是用了简单的浅拷贝
        System.out.println(bird.getType());
        System.out.println(clone.getType());
        System.out.println(bird.getType());
        System.out.println(clone.getType());
        System.out.println(bird.getClass() == clone.getClass());
        System.out.println(bird.getType() == clone.getType());

    }

}
