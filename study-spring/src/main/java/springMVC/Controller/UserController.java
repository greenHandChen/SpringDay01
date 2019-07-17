package springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springMVC.Entity.User;
import springMVC.Service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 注册动作
    public void signUpAction(User user) {

        userService.signUp(user);

    }


}
