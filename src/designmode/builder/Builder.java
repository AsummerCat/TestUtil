package designmode.builder;

/**
 * 装配流程
 *
 * @author cxc
 * @date 2018/12/2 16:14
 */
public abstract class Builder {
    //第一步：装CPU
//声明为抽象方法，具体由子类实现
    public abstract void BuildCPU();

    //第二步：装主板
//声明为抽象方法，具体由子类实现
    public abstract void BuildMainboard();

    //第三步：装硬盘
//声明为抽象方法，具体由子类实现
    public abstract void BuildHD();

    //返回产品的方法：获得组装好的电脑
    public abstract Computer GetComputer();
}
