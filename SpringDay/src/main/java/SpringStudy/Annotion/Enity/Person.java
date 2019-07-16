package SpringStudy.Annotion.Enity;

import org.springframework.stereotype.Component;

/**
 * @Description: 用户实体
 * @Author: TanLinQuan
 * @Date: 2019/7/16 16:00
 * @Version: V1.0
 **/
public class Person {

    /**
     * name => 用户姓名
     * age => 用户年龄
     * address => 用户地址
     * **/
    private String name;
    private Integer age;
    private String address;

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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
