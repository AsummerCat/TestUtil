package designmode.strategy;

/**
 * 策略模式demo
 *
 * @author cxc
 * @date 2018/11/25 21:33
 */
public class StrategyMain {

    public static void main(String[] args) {

        //分别选择不同的策略  优衣库
        StrategyPattern pattern = new StrategyPattern(new Uniqlo());
        pattern.getGoodsList().forEach(System.out::println);
        pattern.getName();

        //分别选择不同的策略  优衣库
        StrategyPattern coco = new StrategyPattern(new Coco());
        coco.getGoodsList().forEach(System.out::println);
        coco.getName();
    }
}
