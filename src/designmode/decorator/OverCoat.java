package designmode.decorator;

/**
 * 大衣
 * @author cxc
 * @date 2018/11/26 09:25
 */
public class OverCoat implements Coat {
    @Override
    public void show() {
        System.out.println("穿大衣");
    }
}
