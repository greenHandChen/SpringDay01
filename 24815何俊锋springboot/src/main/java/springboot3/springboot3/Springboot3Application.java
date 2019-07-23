package springboot3.springboot3;

import com.HelloServiceAutoConfiguration;
import com.HelloServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class Springboot3Application {
    @Resource
    private HelloServiceConfiguration helloServiceConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(Springboot3Application.class, args);
    }

    @RequestMapping("/helloSpringboot")
    public String sayhello() {
        return helloServiceConfiguration.getSayHello();
    }
}
