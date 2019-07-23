import com.hand.dao.OrdersMapper;
import com.hand.vo.OrdersExt;
import com.hand.vo.OrdersItemVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.List;

public class OrderTest {

    private ApplicationContext applicationContext;
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        sqlSessionFactory = applicationContext.getBean("sqlSessionFactory",SqlSessionFactory.class);
    }
    @Test
    public void test1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper orders = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt o = new OrdersExt();
//        o.setName("笔记本");
        o.setNumber("1000012");
        List<OrdersExt> ordersExts = orders.findOrdersExts(o);
        if(ordersExts!=null){
            for(OrdersExt o1 :ordersExts){
                BigDecimal totalPrice = new BigDecimal("0");
                List<OrdersItemVo> ordersItems = o1.getOrdersItems();
                if(ordersItems!=null){
                    for(OrdersItemVo item :ordersItems){
                        totalPrice = totalPrice.add(item.getPrice().multiply(new BigDecimal(item.getNum().toString())));
                    }
                }
                o1.setTotal_amount(totalPrice);
            }

            for(OrdersExt o1 :ordersExts){
                System.out.println("订单编号   创建时间   总价   用户");
                System.out.println(o1.getNumber() +"   "+o1.getCreatetime()+"   "+o1.getTotal_amount()+"   "+o1.getUser());
                List<OrdersItemVo> ordersItems = o1.getOrdersItems();
                if(ordersItems!=null){
                    for(OrdersItemVo item :ordersItems){
                        System.out.println(item.getName()+"   "+item.getPrice()+"   "+item.getNum());
                    }
                }
            }
        }

    }

}
