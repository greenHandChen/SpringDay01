
import com.ssm.model.OrdersExt;
import com.ssm.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Autowired
      private UserServiceImpl userService;
      @Test
      public void testSelectUser(){

          List<OrdersExt> list=userService.finOrdersExt(ordersExt);
          System.out.println(list+"共有"+list.size());

      }

}
