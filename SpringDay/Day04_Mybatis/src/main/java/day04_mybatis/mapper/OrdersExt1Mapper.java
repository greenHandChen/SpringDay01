package day04_mybatis.mapper;

import day04_mybatis.domain.User;
import day04_mybatis.domain.ext.OrdersExt;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface OrdersExt1Mapper {
    OrdersExt findOrdersExt(OrdersExt ordersExt);

    User findUserById(Integer id);
}
