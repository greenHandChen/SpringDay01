package com.exam.mapper;

import com.exam.domain.OrdersExt;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 15:36 2019/7/20
 * @Modified By:
 */
public interface UserMapper {

    List<OrdersExt> findUserById(Integer id);
}
