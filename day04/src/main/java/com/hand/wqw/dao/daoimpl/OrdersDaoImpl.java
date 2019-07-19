package com.hand.wqw.dao.daoimpl;

import com.hand.wqw.dao.OrdersDao;
import com.hand.wqw.vo.OrderExt;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class OrdersDaoImpl extends SqlSessionDaoSupport implements OrdersDao {
    @Override
    public List<OrderExt> findOrderExts(OrderExt orderExt) {
        List<OrderExt> objects = this.getSqlSession().selectList("testOrder.findOrderExts", orderExt);
        return objects;
    }

    @Override
    public OrderExt findOrderExtsLazyLoad(Integer id) {
        OrderExt objects = this.getSqlSession().selectOne("testOrder.findOrderExtsLazyLoad", id);
        return objects;
    }
}
