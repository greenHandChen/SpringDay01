package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller("controller")
@Controller
public class IController {

    @Autowired
    private IService service;

//    @Autowired
    public void setService(IService service){
        this.service = service;
    }

    public void addUser(){
        System.out.println("准备开始添加用户。。。");
        service.addUser();
    }
}
