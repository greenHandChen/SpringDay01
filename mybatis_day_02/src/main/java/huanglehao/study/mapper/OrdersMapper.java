package huanglehao.study.mapper;

import huanglehao.study.po.Orders;
import huanglehao.study.po.OrdersExt;
import huanglehao.study.po.User;
import huanglehao.study.po.UserQueryVo;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:17 2019/7/18
 */
public interface OrdersMapper {
    //一对一之resultType
    public List<OrdersExt>findOrderAndUser();

    //一对一之resultMap
    public List<OrdersExt>findOrderAndUserRstMap();

    //一对多
    public List<OrdersExt> findOrderAndDetailesRstMap();

    //多对多
    public List<User> findUserAndItemsRstMap();

    public List<OrdersExt> findOrderAndUserLazyLoading();
}
