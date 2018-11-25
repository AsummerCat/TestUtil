package designmode.simplefactory;

/**
 * 简单工厂模式
 *
 * @author cxc
 * @date 2018/11/24 22:52
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        //比如现在我要创建一个小猫工厂
        Animal cat = SimpleFactory.createAnimal("cat");
        cat.eat();
        cat.shout();

        //然后再创建一个小狗工厂
        Animal dog = SimpleFactory.createAnimal("dog");
        dog.eat();
        dog.shout();
    }
}
