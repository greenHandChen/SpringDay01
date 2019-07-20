package com.ssm.dao;


import com.ssm.model.OrdersExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by minxi.jiang on 2019/7/20
 */
public interface IUserDao {
      List<OrdersExt> finOrdersExt(OrdersExts ordersExts);
}
