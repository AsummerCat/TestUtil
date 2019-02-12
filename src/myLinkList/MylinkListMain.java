package myLinkList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author cxc
 * @date 2019/1/30 14:09
 */
public class MylinkListMain {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);


        MyLinkList<String> list2 = new MyLinkList<>();
        list2.add("a");
        list2.add("b");
        String[] arr = new String[]{"张三", "李四"};
        list2.addAll(0, Arrays.asList(arr));
        list2.pop();

        list2.forEach(System.out::println);
    }
}
