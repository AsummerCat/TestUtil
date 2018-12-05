package designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式demo
 *
 * @author cxc
 * @date 2018/12/4 14:24
 */
public class ObserverMain {
    public static void main(String[] args) {

        //订阅人数集合
        List<User> observer = new ArrayList<>();

        //现在有10个订阅者 订阅我的节目
        for (int i = 0; i < 10; i++) {
            observer.add(new User("小明" + i));
        }

        //接着 我的微信要更新一个节目 需要通知所有的订阅者
        Weixin weixin = new Weixin(observer);
        weixin.message("我要开始发送信息了");
        System.out.println("---------------------------");
        //现在又有两个用户订阅了我
        weixin.addUser(new User("小美丽"));
        weixin.addUser(new User("大可爱"));
        weixin.message("大家好 我又推送一次了");

        System.out.println("---------------------------");

    }
}
