package Mapper;

import domain.OrdersExt;
import domain.User;

import java.util.List;

public interface OrderMapper {

    /**
     * @Description 根据条件查询结果
     * @Author  ChenWeixong
     * @Date   2019/7/20 15:49
     * @Param
     * @Return
     * @Exception
     * */
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);


    /**
     * @Description 根据id查询user信息
     * @Author  ChenWeixong
     * @Date   2019/7/20 15:50
     * @Param  id
     * @Return      User
     * @Exception
     * */
    User findUserById(Integer id);
}
