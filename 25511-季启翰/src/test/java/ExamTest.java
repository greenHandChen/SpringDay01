import com.jqh.mapper.OrdersMapper;
import com.jqh.pojo.OrdersExt;
import com.jqh.util.BeanUtil;
import org.junit.Test;

import java.util.List;

/**
 * @Auther: 几米
 * @Date: 2019/7/20 15:56
 * @Description: ExamTest
 */
public class ExamTest {
    @Test
    public void test1(){
        OrdersMapper bean = BeanUtil.getBean(OrdersMapper.class);
        List<OrdersExt> ordersExts = bean.findOrdersExts(new OrdersExt());
        System.out.println(ordersExts);
    }
}
