package designmode.template;

/**
 * 学生B 具体实现类
 *
 * @author cxc
 * @date 2018/11/28 16:28
 */
public class StudentB extends TestPaper {
    public StudentB(String studentName) {
        super.studentName = studentName;
    }

    @Override
    public void oneQuestion() {
        System.out.println("A");
    }

    @Override
    public void twoQuestion() {
        System.out.println("B");
    }

    @Override
    public void threeQuestion() {
        System.out.println("C");
    }

    @Override
    public void fourQuestion() {
        System.out.println("D");
    }
}
