package club.osai.dao;

import club.osai.po.OrdersExt;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OrderDao.java
 * @Version: 1.0
 * @Date: 2019/7/20
 * @Description:
 */
@Repository
public interface OrderDao {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
