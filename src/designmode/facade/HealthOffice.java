package designmode.facade;

/**
 * 卫生局
 *
 * @author cxc
 * @date 2018/12/2 15:42
 */
public class HealthOffice implements Audit {
    @Override
    public void auditProcess() {
        System.out.println("卫生局通过审批");
    }
}
