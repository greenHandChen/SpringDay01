package com.hand.service.impl;

import com.hand.entity.User;
import com.hand.entity.UserExit;
import com.hand.entity.UserOrders;
import com.hand.mapper.UserMapper;
import com.hand.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    @Qualifier("userMapper")
    UserMapper userMapper;

    /**
     * 获取所有的用户
     *
     * @return
     */
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    /**
     * 移除用户
     *
     * @param user
     * @return
     */
    public int removeUser(User user) {
        return userMapper.deleteUserById(user.getId());
    }

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    public int modifyUser(User user) {
        return userMapper.updateUser(user);
    }

    /**
     * 通过用户ID查询用户
     * @param id
     * @return
     */
    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    /**
     * 返回Map包装的User对象
     * @return
     */
    public List<Map<Integer, User>> getAllUserMap() {
        return userMapper.getAllUserMap();
    }

    /**
     * 名字转换,添加事务控制
     *
     * @param user1_id
     * @param user2_id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int changeName(int user1_id, int user2_id) {
        User user1 = userMapper.selectUserById(user1_id);
        User user2 = userMapper.selectUserById(user2_id);

        String tmpName = user1.getUsername();
        user1.setUsername(user2.getUsername());
        int flag1 = 0, flag2 = 0;
        flag1 = userMapper.updateUser(user1);
//        int i = 2/0;
        user2.setUsername(tmpName);
        flag2 = userMapper.updateUser(user2);
        return flag1 == flag2 ? flag1 : 0;
    }

    public List<UserOrders> getUser_OrdersByUserId(int user_id) {
        return null;
    }

    /**
     * 返回用户订单信息
     * @param user_id
     * @return
     */
    public List<UserExit> getUser_OrdersByUserIduseExit(int user_id) {
        return userMapper.selectUserAndOrders(user_id);
    }
}
