package com.ssm.dao;

import com.ssm.model.Account;
import com.ssm.model.OrdersExt;
import com.ssm.model.SellerAndManager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by minxi.jiang on 2019/7/18
 */
public interface IUserDao {
      /**
       * @Author:minxi.jiang
       * @Decription:根据账户的钱查询用户信息
       * @Date: 2019/7/18
       * */
      List<Account> findUserByMoney(Double money);
      /**
       * @Author:minxi.jiang
       * @Decription:查询为卖出某商品的销售员以及对应的经理信息
       * @Date:2019/7/19
       * */
      List<SellerAndManager> findSellerAndManagerByGoodsName(String goodName);
      /**
       * @Author:mix.jiang
       * @Decription:查询销售记录中销售员的信息
       * @Date:2019/7/19
       * */
      List<SellerAndManager> findSellerAndSellerRecords();
      /**
       * @Author:minxi.jiang
       * @Decription:根据订单ID查询订单和用户信息
       * @Date:2019/7/19
       * */
      List<OrdersExt> getOrderExtByOrderId(@Param("id") int id);
      /**
       * @Author:minxi.jiang
       * @Decription:根据订单ID查询订单和用户信息
       * @Date:2019/7/19
       * */
      List<OrdersExt> findOrdersByResultMap(@Param("id") int id);
      /**
       * @Author:minxi.jiang
       * @Decription:查询所有订单的订单的明细
       * @Date:2019/7/19
       * */
      List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);

}
