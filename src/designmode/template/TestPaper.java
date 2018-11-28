package designmode.template;

/**
 * 试卷模板类
 *
 * @author cxc
 * @date 2018/11/28 16:22
 */
public abstract class TestPaper {
    protected String studentName;

    /**
     * 学生名称
     *
     * @return
     */
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    /**
     * 回答内容  禁止子类复写
     * 防止更改流程的执行顺序
     */
    protected final void theTemplatePaper() {
        System.out.println("学生->" + studentName + "<-----开始考试");
        System.out.println(studentName + "填写的第一题:");
        oneQuestion();
        System.out.println(studentName + "填写的第二题:");
        twoQuestion();
        System.out.println(studentName + "填写的第三题:");
        threeQuestion();
        System.out.println(studentName + "填写的第四题:");
        fourQuestion();
        System.out.println("学生->" + studentName + "<-----结束考试");
    }


    //以下部分交给子类进行修改

    /**
     * 第一题
     */
    public abstract void oneQuestion();

    /**
     * 第二题
     */
    public abstract void twoQuestion();

    /**
     * 第三题
     */
    public abstract void threeQuestion();

    /**
     * 第四题
     */
    public abstract void fourQuestion();
}
