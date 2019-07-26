package huanglehao.study.usermanagerservice.controller;

import huanglehao.study.pojomodul.entity.User;
import huanglehao.study.usermanagerservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 9:56 2019/7/26
 */
@Controller
@RequestMapping("/userManager")
public class UserManagerController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EntendClient entendClient;

    //增加一个用户
    @RequestMapping("/addUser")
    public void addUser(String name){
        User user =new User();
        user.setName(name);
        userMapper.addUser(user);
        entendClient.addEntend("测试添加",2);
    };

    //删除一个用户
    @RequestMapping("/deleteById")
    public void deleteById(int id){
        userMapper.deleteById(id);
        entendClient.deleteById(1);
    };

    //修改
    @RequestMapping("/updateUser")
    public void updateUser(int id,String name){
        User user =new User();
        user.setId(1);
        user.setName(name);
        userMapper.updateUser(user);
        entendClient.updateEntend(1,"改",1);
    };

    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList(){
        System.out.println(entendClient.getEntendList());;
        System.out.println(userMapper.selectUserList());
        return userMapper.selectUserList();
    }


}
