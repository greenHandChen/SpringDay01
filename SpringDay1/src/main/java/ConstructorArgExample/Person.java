package ConstructorArgExample;

public class Person {
    private String name;
    private String age;
    private String address;

    public Person(String name, String age, String address) {
        super();
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + " and age = " + age +
                " and address = " + address;
    }
}
