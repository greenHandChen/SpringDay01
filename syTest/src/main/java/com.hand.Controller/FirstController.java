package com.hand.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.hand.svc.AddUserSvc;
@Controller
public class FirstController {
    private AddUserSvc addUserSvc;
    @Autowired
    public void setAddUserSvc(AddUserSvc addUserSvc){
        this.addUserSvc=addUserSvc;
    }

    public void addUser(){
        System.out.println("用户正在添加");
        addUserSvc.addUser();
    }
}
