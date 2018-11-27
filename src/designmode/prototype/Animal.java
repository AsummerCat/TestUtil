package designmode.prototype;

/**
 * 原型模式 抽象类 继承Cloneable接口
 * @author cxc
 * @date 2018/11/27 17:14
 */
public abstract class Animal implements Cloneable{

    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
