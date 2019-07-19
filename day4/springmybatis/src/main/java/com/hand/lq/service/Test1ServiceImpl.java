package com.hand.lq.service;

import com.hand.lq.dao.Test1Mapper;
import com.hand.lq.pojo.OrderExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test1ServiceImpl implements Test1Service {
   @Autowired
    Test1Mapper test1Mapper;
    public void findOrderExt() {
        OrderExt orderExt=new OrderExt();
        orderExt.setId(5);
        System.out.println(test1Mapper.findOrderExt(orderExt).toString());
    }
}
