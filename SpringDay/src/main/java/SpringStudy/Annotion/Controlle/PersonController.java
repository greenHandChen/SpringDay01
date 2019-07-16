package SpringStudy.Annotion.Controlle;

import SpringStudy.Annotion.Enity.Person;
import SpringStudy.Annotion.Service.UserService;
import SpringStudy.SpringDi.Pserson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description: 用户模块控制器
 * @Author: TanLinQuan
 * @Date: 2019/7/16 16:11
 * @Version: V1.0
 **/
@Controller
public class PersonController {

    @Autowired
    private UserService userService;

    public void add() {
        Person person = new Person();
        person.setName("张三");
        person.setAge(26);
        person.setAddress("安徽芜湖");
        if (userService.addUser(person) == 1) {
            System.out.println("已处理用户信息");
        }else {
            System.out.println("用户信息上传失败");
        }
    }
}
