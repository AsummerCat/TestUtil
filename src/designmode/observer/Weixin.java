package designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者 --->公众号
 *
 * @author cxc
 * @date 2018/12/4 14:19
 */
public class Weixin implements Observable {
    private List<User> observer = new ArrayList<>();

    public Weixin(List<User> observer) {
        this.observer = observer;
    }

    /**
     * 新增一个观察者
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        observer.add(user);
    }

    /**
     * 移除某位观察者
     *
     * @param user
     */
    @Override
    public void rmUser(User user) {
        if (!observer.isEmpty()) {
            observer.remove(user);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void message(String message) {
        System.out.println("发送消息 通知以下观察者");
        observer.forEach(data -> {
            data.getMeMessage(message);
        });
    }
}
