package designmode.decorator;

/**
 * 衬衫
 *
 * @author cxc
 * @date 2018/11/26 09:25
 */
public class Shirt implements Coat {
    @Override
    public void show() {
        System.out.println("穿衬衫");
    }
}
