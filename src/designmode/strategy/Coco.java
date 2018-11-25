package designmode.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Coco奶茶店
 *
 * @author cxc
 * @date 2018/11/25 21:20
 */
public class Coco extends Store {
    @Override
    public void getName() {
        System.out.println(boss + "是coco奶茶店");
    }

    @Override
    public List getGoodsList() {
        List<String> list = new ArrayList<>();
        list.add("野果奶茶");
        list.add("波霸奶茶");
        list.add("养乐多奶茶");
        list.add("劲爆大奶茶");
        return list;
    }
}
