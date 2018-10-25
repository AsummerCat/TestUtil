package javaversion8;

import java.io.Serializable;

/**
 * @author cxc
 * @date 2018/10/25 11:15
 */
public class OptionalUser implements Serializable{

    private static final long serialVersionUID = 5814997214510443745L;
    private String name;
    private Integer age;
    private String address;

    public OptionalUser(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
