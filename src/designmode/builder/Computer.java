package designmode.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑类
 */
public class Computer {

    //电脑组件的集合
    private List<String> parts = new ArrayList<String>();

    //用于将组件组装到电脑里
    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        parts.forEach(data -> System.out.println("组件" + data + "装好了"));
        System.out.println("电脑组装完成,请验收");
    }

}