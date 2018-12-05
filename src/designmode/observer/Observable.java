package designmode.observer;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *
 * @author cxc
 * @date 2018/12/4 14:14
 */
public interface Observable {
    void addUser(User user);

    void rmUser(User user);

    void message(String message);
}
