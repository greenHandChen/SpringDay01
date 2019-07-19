package mybatisdemo.mapper;

import mybatisdemo.po.OrdersExt;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 9:43
 */
public interface OrdersMapper {

    //一对多
    List<OrdersExt> findOrdersAndDetailRstMap();
}
