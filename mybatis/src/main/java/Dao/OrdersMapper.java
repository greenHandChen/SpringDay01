package Dao;

import Vo.OrdersVo;

import java.util.List;

public interface OrdersMapper {

    List<OrdersVo> findOrderVo(OrdersVo ordersVo);

    List<OrdersVo> findorderVoMap(OrdersVo ordersVo);

    List<OrdersVo> findordersAndOrderDetailVoMap(OrdersVo ordersVo);

    List<OrdersVo> findOrderInfoByLazyLoad(Integer id);
}
