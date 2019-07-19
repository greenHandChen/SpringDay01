package day04_mybatis.mapper;

import day04_mybatis.domain.ext.OrdersExt2;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface OrdersExt2Mapper {
    public List<OrdersExt2Mapper> findOrdersExt(OrdersExt2 ordersExt2);
}
