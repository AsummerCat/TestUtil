package proxytest.staticproxy;

/**
 * 接口实现
 * 目标对象
 *
 * @author cxc
 * @date 2018/11/16 14:53
 */
public class HelloImpl implements Hello {

    @Override
    public void save() {
        System.out.println("输出了啥内容");
    }
}
