import damain.OrdersExt;
import mapper.OrdersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class TestDay2 {
    private OrdersMapper ordersMapper;
    @Before
    public void init() throws IOException {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\_25752XuBoSi\\Spring-mybatis\\src\\main\\resources\\applicationContext.xml");
        ordersMapper = applicationContext.getBean(OrdersMapper.class);

    }
    @Test
    public void findOrdersExt(){
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.getItems().setName("笔记本");
        ordersExt.setNumber("100010");
        ordersExt.setPriceStart(1000);
        ordersExt.setPriceEnd(10000);
        ordersExt.setCreatetimeStart(new Date("2015-01-01"));
        ordersExt.setCreatetimeEnd(new Date("2018-01-01"));
        List<OrdersExt> ordersExts1=ordersMapper.findOrdersExt(ordersExt);


}
