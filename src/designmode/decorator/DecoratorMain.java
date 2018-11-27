package designmode.decorator;

/**
 * 装饰器模式demo
 *
 * @author cxc
 * @date 2018/11/26 09:27
 */
public class DecoratorMain {
    public static void main(String[] args) {
        //使用A装饰器
        DecoratorA decoratorA = new DecoratorA(new OverCoat());
        //再使用B装饰器再装饰一次
        DecoratorB decoratorB = new DecoratorB(decoratorA);
        //装饰完成
        decoratorB.show();

        decoratorB.show2();
    }
}

