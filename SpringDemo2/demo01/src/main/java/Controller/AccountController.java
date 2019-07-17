package Controller;

import Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {

    @Autowired
    IAccountService iAccountService;

    public void t1(){
        iAccountService.transfer("mybatis","hibernate",50.00);
    }
}
