package com.hand.integration.user;

import com.hand.integration.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/22 19:07
 */
@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    IUserService userServiceImpl;

    @GetMapping("list")
    public R list(){
        try {
            return R.isOk().data(userServiceImpl.findAllUser());
        }catch (Exception e){
            return R.isFail(e);
        }
    }

}
