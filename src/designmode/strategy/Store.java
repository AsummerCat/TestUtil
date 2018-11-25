package designmode.strategy;

import java.util.List;

/**
 * 购物店
 *
 * @author cxc
 * @date 2018/11/25 21:16
 */
public abstract class Store {
    public String boss;

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    /**
     * 获取店铺名称
     */
    public abstract void getName();

    /**
     * 获取该店铺销售的产品
     */
    public abstract List getGoodsList();
}
