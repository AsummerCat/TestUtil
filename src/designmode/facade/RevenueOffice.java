package designmode.facade;

/**
 * 税务局
 *
 * @author cxc
 * @date 2018/12/2 15:42
 */
public class RevenueOffice implements Audit {
    @Override
    public void auditProcess() {
        System.out.println("税务局完成登记，定时回去收税");
    }
}
