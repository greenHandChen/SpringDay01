package Mapper;

import Entity.Order;
import Entity.OrderExt;

import java.util.List;

public interface OrderMapper {

    public Order findOrderById(Integer id);

    // （1）. 一对一映射：使用resultType
    public List<OrderExt> findOrderExt1(OrderExt orderExt);

    // （2）. 一对一映射：使用resultMap
    public List<OrderExt> findOrderExt2(OrderExt orderExt);

    // 一对多映射
    public List<OrderExt> findDrderAndOrderDetail();

}
