package exam.mapper;

import exam.domain.OrdersExt;

import java.util.List;

public interface UserMapper {

    /**
      * @Author: MikeLv
      * @Description: 获取订单及其他详细信息
      * @Date: 2019/7/20 15:23
      */
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);

}
