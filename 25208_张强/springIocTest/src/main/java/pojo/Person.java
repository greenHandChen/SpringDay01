package pojo;

import org.springframework.stereotype.Component;

/**
 * Created by zq on 2019/7/16
 */
@Component("person1")
public class Person {
    private String name;
    private Integer age;
    private String address;

    private  void sayHello(){
        System.out.println("hello i am 蔡徐坤");
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
