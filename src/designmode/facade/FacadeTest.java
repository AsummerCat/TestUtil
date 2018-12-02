package designmode.facade;

/**
 * 外观模式
 *
 * @author cxc
 * @date 2018/12/2 15:44
 */
public class FacadeTest {

    /**
     * 审批流程
     */
    public void approvalProcess() {
        new HealthOffice().auditProcess();
        new RevenueOffice().auditProcess();
        new SaicOffice().auditProcess();
    }

    ;

}
