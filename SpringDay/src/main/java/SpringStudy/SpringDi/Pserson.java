package SpringStudy.SpringDi;

/**
 * @Description: SpringDi例子
 * @Author: TanLinQuan
 * @Date: 2019/7/16 15:19
 * @Version: V1.0
 **/
public class Pserson {

    private String name;
    private Integer age;
    private String address;

//    构造注入
//    public Pserson(String name, Integer age, String address) {
//        super();
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

//    设值注入
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Pserson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
