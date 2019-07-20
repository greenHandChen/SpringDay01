package haunglehao.study.ms.mapper;

import haunglehao.study.ms.po.OrdersExt;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:17 2019/7/18
 */
public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
