package designmode.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 优衣库
 *
 * @author cxc
 * @date 2018/11/25 21:19
 */
public class Uniqlo extends Store {
    @Override
    public void getName() {
        System.out.println(boss + "是优衣库");
    }

    @Override
    public List getGoodsList() {
        List<String> list = new ArrayList<>();
        list.add("内衣");
        list.add("短裤");
        list.add("皮裤");
        list.add("衬衫");
        return list;
    }
}
