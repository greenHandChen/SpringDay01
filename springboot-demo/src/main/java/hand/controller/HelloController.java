package hand.controller;

import hand.mapper.UserMapper;
import hand.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @Auther: 几米
 * @Date: 2019/7/23 17:19
 * @Description: HelloController
 */
@RestController
public class HelloController {
    @Resource
    UserMapper userMapper;

    @GetMapping("/")
    User hello(){
        return userMapper.selectByPrimaryKey(10);
    }

}
