package com.mapper;

import com.domain.Orders;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 22:33 2019/7/19
 * @Modified By:
 */
public interface OrderMapper {
    Orders findOrdersById(Integer id);
}
