package com.ssm.service;

import com.ssm.model.Account;
import com.ssm.model.OrdersExt;
import com.ssm.model.SellerAndManager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by minxi.jiang on 2019/7/18
 * */
public interface IUserService {
     /**
      * @Author:minxi.jiang
      * @Decription:提供根据money查询用户信息
      * @Date:2019/7/18
      * */
     List<Account> findUserByMoney(Double money);
     /**
      * @Author:minxi.jiang
      * @Decription:查询未卖出某商品的销售人员姓名和经理的信息
      * @Date:2019/7/19
      * */
     List<SellerAndManager> findSellerAndManagerByGoodsName(String goodName);
     /**
      * @Author:minxi.jiang
      * @Decription:通过销售记录查询销售员的信息
      * @Date:2019/7/18
      * */
     List<SellerAndManager> findSellerAndSellerRecords();
     /**
      * @Author:minxi.jiang
      * @Decription:根据订单ID查询订单和用户信息
      * @Date:2019/7/19 上午
      * */
     List<OrdersExt> getOrderExtByOrderId(int id);
     /**
      * @Author:minxi.jiang
      * @Decription:根据订单ID查询订单和用户信息
      * @Date:2019/7/19 下午
      * */
     List<OrdersExt> findOrdersByResultMap(int id);
     /**
      * @Author:minxi.jiang
      * @Decription:查询所有订单和订单明细
      * @Date:2019/7/19 晚
      * */
     List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);
}
