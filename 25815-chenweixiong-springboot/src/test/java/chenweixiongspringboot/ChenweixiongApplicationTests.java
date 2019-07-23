package chenweixiongspringboot;

import hellospringcloud.configBean.HelloSpringboot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChenweixiongApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void t1() {
        HelloSpringboot helloSpringboot=new HelloSpringboot();
        helloSpringboot.sayHello();
    }

}
