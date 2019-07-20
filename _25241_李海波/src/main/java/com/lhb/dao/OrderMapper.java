package com.lhb.dao;

import org.hgh.pojo.User;
import org.hgh.vo.OrderVO;

import java.util.List;

public interface OrderMapper {
    OrderVO findOrderVOById(Integer id);

    List<OrderVO> findOrderList();

    List<OrderVO> findOrderDetials();

    List<OrderVO> findOrderInfoByLazyLoad(Integer id);

    User findUserById(Integer id);

}
