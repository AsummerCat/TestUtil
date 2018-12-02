package designmode.facade;

/**
 * 工商局
 *
 * @author cxc
 * @date 2018/12/2 15:42
 */
public class SaicOffice implements Audit {
    @Override
    public void auditProcess() {
        System.out.println("工商局完成审核，办法营业执照");
    }
}
