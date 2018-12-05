package designmode.observer;

/**
 * 观察者
 *
 * @author cxc
 * @date 2018/12/4 14:16
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void getMeMessage(String message) {
        System.out.println(name + "收到通知消息" + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
