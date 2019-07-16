import SpringStudy.Annotion.Enity.Person;
import SpringStudy.Annotion.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/16 14:02
 * @Version: V1.0
 **/
public class HelloSpring {

    private String info;

    @Autowired
    private UserService userService;


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
