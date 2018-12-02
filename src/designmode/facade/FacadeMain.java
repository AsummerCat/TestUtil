package designmode.facade;

/**
 * 外观模式测试类
 *
 * @author cxc
 * @date 2018/12/2 15:38
 */
public class FacadeMain {

    public static void main(String[] args) {
        System.out.println("小明要开餐馆");
        System.out.println("开始跑流程");
        FacadeTest facadeTest = new FacadeTest();
        facadeTest.approvalProcess();
        System.out.println("流程结束");
    }
}
