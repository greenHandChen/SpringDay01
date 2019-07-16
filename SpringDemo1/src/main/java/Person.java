import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    public void sayHello() {
        System.out.println("hello i'm component");
    }

    private String name;
    private  String age;
    private  String address;

    public Person() {

    }

    @Override
    public String toString() {
        return "text.Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
