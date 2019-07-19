package a_1.mapper;

import a_1.domain.OrdersExt;
import a_1.domain.User;

import java.util.List;

public interface OrdersMapper {

    /**
      * @Author: MikeLv
      * @Description: 根据订单ID查询订单以及用户信息
      * @Date: 2019/7/19 9:33
      */
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    /**
      * @Author: MikeLv
      * @Description: 根据订单ID查询订单以及用户信息by-resulrMap
      * @Date: 2019/7/19 10:28
      */
    List<OrdersExt> findOrdersByResultMap(OrdersExt orders);

    /**
      * @Author: MikeLv
      * @Description: 一对多
      * @Date: 2019/7/19 11:42
      */
    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt orders);

    /**
      * @Author: MikeLv
      * @Description: 根据订单ID进行延迟加载查询
      * @Date: 2019/7/19 14:09
      */
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);

}
