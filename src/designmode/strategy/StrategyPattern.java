package designmode.strategy;

import java.util.List;

/**
 * 策略模式
 *
 * @author cxc
 * @date 2018/11/25 21:28
 */
public class StrategyPattern extends Uniqlo {
    //因为加上了继承所以这里表述的有点像是代理模式
    private Store store;


    public StrategyPattern(Store store) {
        this.store = store;
        store.setBoss("小明");
    }


    @Override
    public void getName() {
        store.getName();
    }

    @Override
    public List getGoodsList() {
        return store.getGoodsList();
    }
}
