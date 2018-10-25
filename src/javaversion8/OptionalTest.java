package javaversion8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author cxc
 * @date 2018/10/25 09:37
 * Java 8 Optional 类
 * Optional 类的引入很好的解决空指针异常。
 */
public class OptionalTest {

    public static void main(String[] args) {
        //返回空的 Optional 实例。
        Optional<Object> empty = Optional.empty();

        //判断其他对象是否等于Optional
        Integer A = 1;
        boolean equals = empty.equals(A);
        System.out.println("equals:" + equals);

        // Optional.ofNullable - 允许传递为 null 参数
        Integer value1 = null;
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Integer value2 = 1897001;
        Optional<Integer> b = Optional.of(value2);
        System.out.println("Optional.of:" + b.get());

        // Optional.isPresent - 判断值是否存在
        System.out.println("isPresent第一个参数值存在: " + a.isPresent());
        System.out.println("isPresent第二个参数值存在: " + b.isPresent());

        //void ifPresent(Consumer<? super T> consumer) 存在则进行消费 Lambda表达式
        b.ifPresent(System.out::println);

        //Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value3 = a.orElse(new Integer(0));
        Integer value4 = b.orElse(new Integer(0));
        System.out.println("Optional.orElse:" + value3);
        System.out.println("Optional.orElse:" + value4);

        //T orElseGet(Supplier<? extends T> other)如果存在该值，返回值， 否则触发 other，并返回 other 调用的结果。
        Integer value8 = a.orElseGet(() -> 10086);
        System.out.println("orElseGet:" + value8);


        //Optional.get - 获取值，值需要存在 不存在会报错
        Integer value5 = b.get();
        System.out.println("Optional.get:" + value5);


        //Optional.of 传入null会报错NullPointerException
        Integer value6 = 6;
        Optional<Integer> c = Optional.of(value6);
        System.out.println("Optional.of :" + c.get());

        //map的使用,
        OptionalUser optionalUser = new OptionalUser("小明", "没有地址");
        String test = Optional.ofNullable(optionalUser).map(data -> data.getName()).map(data -> data.replace("小", "明")).orElse("default");
        System.out.println("Map:" + test);

        //过滤 filter
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Optional<List> list1 = Optional.of(list).filter(data -> data.size() > 2);
        list1.ifPresent(Data -> {
            Data.forEach(tet -> System.out.println("遍历内容" + tet));
        });


    }
}
