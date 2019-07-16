package spring_03;

public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person(String name,Integer age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
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
