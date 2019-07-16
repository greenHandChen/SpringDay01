package hand_china.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private Integer age;


    public void sss(){
        System.out.println(11111);
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
