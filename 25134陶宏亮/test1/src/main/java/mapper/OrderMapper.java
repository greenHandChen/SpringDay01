package mapper;

import common.OrdersExt;

import java.util.List;

public interface OrderMapper {
   /* List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
    List<OrdersExt> findOrdersByResultMap(OrdersExt ordersExt);
    *//*延迟加载*//*
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);*/
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
