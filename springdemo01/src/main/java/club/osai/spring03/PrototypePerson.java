package club.osai.spring03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: Person.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */
@Component
@Scope("prototype")
public class PrototypePerson {

    public void sayHello() {
        System.out.println("hello Person!!!!");
    }
}
