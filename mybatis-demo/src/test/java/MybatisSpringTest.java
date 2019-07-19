import com.yonye.mybatis.mapper.LazyLoadRstMappper;
import com.yonye.mybatis.mapper.OrdersExtMapper;
import com.yonye.mybatis.mapper.UsersMapper;
import com.yonye.mybatis.vo.OrdersExt;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/18 20:24
 * @Version:1.0
 * @deseription:
 **/
public class MybatisSpringTest {

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    @Test
    public void test(){

        UsersMapper usersMapper=applicationContext.getBean("usersMapper",UsersMapper.class);

        usersMapper.countUser();
        usersMapper.countUser();
        System.out.println(usersMapper.countUser());
    }

    @Test
    public void test1(){
        OrdersExtMapper ordersExtMapper=applicationContext.getBean("ordersExtMapper",OrdersExtMapper.class);
        List<OrdersExt> ordersExts=ordersExtMapper.findOrdersAndOrderDetail(new OrdersExt());
        System.out.println(ordersExts.size());
    }

    @Test
    public void testLazyLoadRstMappper(){
        LazyLoadRstMappper lazyLoadRstMappper=applicationContext.getBean("lazyLoadRstMappper",LazyLoadRstMappper.class);
        List<OrdersExt> ordersExts=lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        ordersExts.get(0).getUser();
        lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        System.out.println(ordersExts.size());
    }


}
