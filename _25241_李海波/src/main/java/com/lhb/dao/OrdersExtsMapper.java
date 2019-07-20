package com.lhb.dao;

import com.lhb.domain.OrdersExt;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By LHB on 2019/7/20;
 */
@Repository
public interface OrdersExtsMapper {

    /**
     * 根据查询条件查询订单明细数据
     * @param ordersExt
     * @return
     */
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);


}
