import damain.OrdersExt;
import damain.User;
import mapper.OrdersMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDay2 {
    private OrdersMapper ordersMapper;
    @Before
    public void init() throws IOException {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\MybatisDay2\\mybatis_b\\src\\main\\resources\\applicationContext.xml");
        ordersMapper = applicationContext.getBean(OrdersMapper.class);

    }
    @Test
    public void findOrdersExt(){
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts1=ordersMapper.findOrdersExt(ordersExt);
        for(OrdersExt o:ordersExts1)
            System.out.println(o.toString());
    }

}
