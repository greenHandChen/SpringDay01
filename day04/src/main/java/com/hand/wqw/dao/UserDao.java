package com.hand.wqw.dao;

import com.hand.wqw.domain.Orders;
import com.hand.wqw.domain.User;
import com.hand.wqw.vo.UserOrderVo;
import com.hand.wqw.vo.UserQueryVo;
import org.springframework.core.annotation.Order;

import java.util.List;
import java.util.Map;

public interface UserDao {
    User selectUserById(Integer id);
    List<User> selectUsersLikeUserName(String username);
    int insertUser(User user);
    List<User> findByQueryVo(UserQueryVo vo);
    User findUsernameAddressById(Integer id);
    List<User> findByMap(Map map);
    UserOrderVo findUserOrders(Integer userId);
}
