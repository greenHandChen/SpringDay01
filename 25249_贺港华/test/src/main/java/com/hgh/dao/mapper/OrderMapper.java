package com.hgh.dao.mapper;

import com.hgh.vo.OrderVO;

import java.util.List;

public interface OrderMapper {

    List<OrderVO> findOrderVOs(OrderVO orderVO);


}
