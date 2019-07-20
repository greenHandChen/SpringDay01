package com.hgh.service;

import com.hgh.vo.OrderVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public void test(){
        System.out.println(123);
    }

    public List<OrderVO> findOrderVOs(OrderVO orderVO){
        return null;
    }

}
