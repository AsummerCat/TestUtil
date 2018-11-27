package designmode.decorator;

/**
 * 装饰器
 *
 * @author cxc
 * @date 2018/11/26 09:27
 */
public class Decorator implements Coat {

    private Coat coat;

    public Decorator(Coat coat) {
        this.coat = coat;
    }

    @Override
    public void show() {
        this.coat.show();
    }
}
