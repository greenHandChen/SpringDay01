package com.yts.dao;

import com.yts.beans.OrdersExt;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class OrderDaoImpl extends SqlSessionDaoSupport implements OrderDao {

    public List<OrdersExt> findOrdersExts(OrdersExt ordersExt) {
        return this.getSqlSession().selectOne("test.findUserById",ordersExt);

    }

}
