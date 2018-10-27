/**
 * @author cxc
 * @date 2018/10/27 11:23
 * 枚举的使用
 */
public enum EnumTest {
    /**
     * 第一个枚举
     */
    aaa(1,"小明"),
    /**
     * 第二个枚举
     */
    bbb(2,"小东");

    private int age;
    private String heihei;

    EnumTest(int age, String heihei) {
        this.age = age;
        this.heihei = heihei;
    }

    public int getAge() {
        return age;
    }

    public String getHeihei() {
        return heihei;
    }

    /**使用
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println(EnumTest.aaa.getAge());
        System.out.println(EnumTest.aaa.getHeihei());
    }
}

