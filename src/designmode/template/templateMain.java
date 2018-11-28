package designmode.template;

/**
 * 模板模式 测试类
 *
 * @author cxc
 * @date 2018/11/28 16:34
 */
public class templateMain {
    public static void main(String[] args) {
        TestPaper studentA = new StudentA("小明");
        studentA.theTemplatePaper();
        TestPaper studentB = new StudentB("小东");
        studentB.theTemplatePaper();
    }
}
