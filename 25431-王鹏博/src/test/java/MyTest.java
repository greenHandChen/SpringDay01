import com.wpb.entity.OrderExt;
import com.wpb.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void demo(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService)context.getBean("userService");
        List<OrderExt> list=service.findOrderExts();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getUsername()+","+list.get(i).getAddress()+","+
                    list.get(i).getNumber()+","+list.get(i).getName()+","+list.get(i).getPrice()+","+
                    list.get(i).getCreatetime());
        }

    }
}
