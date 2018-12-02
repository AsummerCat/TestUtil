package designmode.builder;

/**
 * 老板类
 */
public class Director {
    //指挥装机人员组装电脑
    public void construct(Builder builder) {
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}