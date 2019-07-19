package com.hand.lq.dao;

import com.hand.lq.pojo.OrderExt;
import com.hand.lq.pojo.OrderExt2;
import com.hand.lq.pojo.OrderExt3;
import com.hand.lq.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Test1Mapper {
    OrderExt findOrderExt(OrderExt orderExt);
    OrderExt2 findOrderExt2(OrderExt orderExt);
    OrderExt3 find3(OrderExt orderExt);
    List<OrderExt2> findOrderByLazyLoad(@Param("id") Integer id);

}
