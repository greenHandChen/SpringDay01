package spring_05;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void sayHello(){
        System.out.println("hello, i am component!");
    }
}
