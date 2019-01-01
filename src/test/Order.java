package test;

/**
 * @author cxc
 * @date 2018/12/29 09:43
 */
public class Order {
private String name;
private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
