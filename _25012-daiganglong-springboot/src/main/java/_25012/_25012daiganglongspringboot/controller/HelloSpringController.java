package _25012._25012daiganglongspringboot.controller;

import com.dragon.starter.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 21:38 2019/7/23
 * @Modified By:
 */
@RestController
public class HelloSpringController {

    @Autowired
    private HelloSpringBoot helloSpringBoot;

    @RequestMapping("/helloSpringBoot")
    public String helloSpringboot(){
        return helloSpringBoot.sayHello("dragon");
    }
}