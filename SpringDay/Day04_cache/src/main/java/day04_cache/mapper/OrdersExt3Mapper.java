package day04_cache.mapper;



import day04_cache.domain.ext.OrdersExt3;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface OrdersExt3Mapper {

    public List<OrdersExt3> findOrdersExt(OrdersExt3 ordersExt3);
}
