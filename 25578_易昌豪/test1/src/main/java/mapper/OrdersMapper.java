package mapper;

import domain.OrdersExt;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
}
