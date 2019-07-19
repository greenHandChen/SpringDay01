package club.osai.dao;

import club.osai.po.OrderExt;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OrderDao.java
 * @Version: 1.0
 * @Date: 2019/7/19
 * @Description:
 */
@Repository
public interface OrderDao {

    List<OrderExt> findOrderExtById(OrderExt orderExt);
    List<OrderExt> findOrdersAndUserResultMap(OrderExt orderExt);
    List<OrderExt> findOrdersAndOrderDetail(OrderExt orderExt);
    List<OrderExt> findOrderByIdLazyLoad(Long id);

}
