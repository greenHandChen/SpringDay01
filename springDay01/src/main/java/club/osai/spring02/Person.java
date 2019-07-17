package club.osai.spring02;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: Person.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */

public class Person {
    private String name;
    private String addre;
    private Integer age;

    public Person() {
    }

    public Person(String name, String addre, Integer age) {
        this.name = name;
        this.addre = addre;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddre() {
        return addre;
    }

    public void setAddre(String addre) {
        this.addre = addre;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toPrint() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addre='" + addre + '\'' +
                ", age=" + age +
                '}';
    }
}
