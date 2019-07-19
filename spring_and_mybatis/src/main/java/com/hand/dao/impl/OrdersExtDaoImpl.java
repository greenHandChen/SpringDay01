package com.hand.dao.impl;

import com.hand.bean.OrdersExt;
import com.hand.dao.OrdersExtDao;
import com.hand.mapper.OrdersExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersExtDaoImpl implements OrdersExtDao {

    @Autowired
    private OrdersExtMapper ordersExtMapper;

    public List<OrdersExt> getOrdersExt(Integer id){
        return ordersExtMapper.getOrdersExt(id);
    }

    public List<OrdersExt> getOrdersExt(){
        return ordersExtMapper.getOrdersExt(null);
    }

}
