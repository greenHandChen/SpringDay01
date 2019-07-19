package zbh.hand.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.aspectj.weaver.ast.Or;
import zbh.hand.pojo.OrderExt;
import zbh.hand.pojo.Orders;

import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/19 9:45
 * @desc:
 */
public interface OrdersMapper extends BaseMapper<Orders> {
    public OrderExt selectOrderAndUser(Integer id);
    public OrderExt selectOrderAndUserAndDetails(Integer id);

    public OrderExt selectOrderInfoByLazyload(Integer id);

    public void addOrder(Orders order);
}
