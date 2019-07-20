package mapper;

import damain.OrdersExt;

import java.util.List;

public interface OrdersMapper {
     List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
     List<OrdersExt> findOrdersByResultMap(OrdersExt orders);
     List <OrdersExt>findOrdersAndOrderDetail(OrdersExt ordersExt);
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
