import com.wzh.domain.OrderExt;
import com.wzh.mapper.OrderExtMapper;
import com.wzh.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class TestDemo {


    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderExtMapper mapper = applicationContext.getBean(OrderExtMapper.class);
        HashMap<String, Object> map = new HashMap();
        map.put("number",3);
        List<OrderExt> ordersExts = mapper.findOrdersExts(map);


    }

}
