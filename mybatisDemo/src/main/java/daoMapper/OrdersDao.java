package daoMapper;

import domain.OrdersExt;
import domain.User;

import java.util.List;

public interface OrdersDao {

    List<OrdersExt> findOrdersByOrderExt(OrdersExt ordersExt);

    List<OrdersExt> findOrdersByResultMap(OrdersExt ordersExt);

    List<OrdersExt> findOrdersAndOrdersDetail(OrdersExt ordersExt);

    List<OrdersExt> listOrders(OrdersExt ordersExt);

    //延迟接口开发
    List<OrdersExt> findOrdersInfoByLazyLoad(Integer id);

    User findUserById(Integer id);

}
