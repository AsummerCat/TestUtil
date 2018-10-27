/**
 * @author cxc
 * @date 2018/10/27 11:23
 */
public enum test {
    aaa(1,"小明"),bbb(2,"小东");

    private int age;
    private String heihei;

    test(int age, String heihei) {
        this.age = age;
        this.heihei = heihei;
    }

    public int getAge() {
        return age;
    }

    public String getHeihei() {
        return heihei;
    }

}
