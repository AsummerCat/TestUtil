package designmode.decorator;

/**
 * 装饰器A
 *
 * @author cxc
 * @date 2018/11/26 09:27
 */
public class DecoratorA extends Decorator {

    public DecoratorA(Coat coat) {
        super(coat);
    }

    /**
     * 调用super.show() 父类的显示方法
     */
    @Override
    public void show() {
        System.out.println("A装饰器装饰");
        super.show();
        System.out.println("A装饰器装饰结束");
    }


    /**
     * 扩展功能
     */
    public void show2() {
        System.out.println("这是A装饰器的扩展功能");
    }

}
