package mapper;

import domain.OrdersExt;
import domain.User;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
    List<OrdersExt> findOrdersByResultMap(OrdersExt ordersExt);
    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);
    List<User> findUserAndItemsRstMap(OrdersExt ordersExt);
    List<OrdersExt> findOrderByLazyLoad(int id);
}
