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
         /*ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
         UserServiceImpl userService=(UserServiceImpl)ctx.getBean("userService");*/
         /* Double money=10.0;*/
        /*  List<SellerAndManager> list=userService.findSellerAndManagerByGoodsName("商品B");
         int id=3;*/
         /*List<OrdersExt> list=userService.getOrderExtByOrderId(id);*/
       /*   List<OrdersExt> list=userService.findOrdersByResultMap(id);*/
          OrdersExt ordersExt=new OrdersExt();
          ordersExt.setId(3);
          List<OrdersExt> list=userService.findOrdersAndOrderDetail(ordersExt);
          System.out.println(list+"共有"+list.size());

      }
     /* public static void main(String args[]){
          IUserDaoTest test=new IUserDaoTest();
          test.testSelectUser();

      }*/
}
