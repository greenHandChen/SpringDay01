package hand.controller;

import hand.stater.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 几米
 * @Date: 2019/7/23 19:58
 * @Description: HelloSpringBootController
 */
@RestController
public class HelloSpringBootController {
    @Autowired
    private HelloSpringBoot helloSpringBoot;
    @GetMapping("/")
    public String helloSpringBoot(){
        return helloSpringBoot.sayHello();
    }
}
