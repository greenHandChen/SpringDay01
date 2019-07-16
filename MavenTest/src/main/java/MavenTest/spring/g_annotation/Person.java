package MavenTest.spring.g_annotation;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void sayHello(){
        System.out.println("Hello im component!");
    }
}
