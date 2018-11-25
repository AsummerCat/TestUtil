package designmode.simplefactory;

/**
 * 简单工厂
 *
 * @author cxc
 * @date 2018/11/24 22:47
 */
public class SimpleFactory {


    /*
     * 模式适用环境
     在以下情况下可以使用简单工厂模式：
     工厂类负责创建的对象比较少：由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
     客户端只知道传入工厂类的参数，对于如何创建对象不关心：客户端既不需要关心创建细节，甚至连类名都不需要记住，只需要知道类型所对应的参数。
     */

    /**
     * 这里表示输入不同的类型来创建不同的动物
     *
     * @param type
     * @return
     */
    public static Animal createAnimal(String type) {
        Animal animal;
        switch (type) {
            case "cat":
                animal = new Cat();
                break;
            case "dog":
                animal = new Dog();
                break;
            default:
                //默认生产小猫
                animal = new Cat();
                break;
        }
        return animal;
    }
}
