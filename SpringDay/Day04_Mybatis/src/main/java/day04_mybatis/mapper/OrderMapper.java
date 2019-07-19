package day04_mybatis.mapper;

import day04_mybatis.domain.ext.OrdersExt;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface OrderMapper {

    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

}
