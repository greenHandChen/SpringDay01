package spring_06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {

    private  AunotationService aunotationService;

    @Autowired
    public void setAunotationService(AunotationService aunotationService) {
        this.aunotationService = aunotationService;
    }

    public void addUser(){
        System.out.println("准备添加用户");
        aunotationService.addUser();
    }


}
