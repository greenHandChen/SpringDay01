package com.zt.eureka_producer_user.service.impl;

import com.zt.eureka_producer_user.dto.User;
import com.zt.eureka_producer_user.mapper.UserMapper;
import com.zt.eureka_producer_user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 14:09
 */
@Service
public class UserServiceImpl implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserByName(String username) {
        /**
         * @description: 根据用户名模糊查询用户
         * @author: invokerZt
         * @date: 2019-07-26 15:02
         * @param username:
         * @return: java.util.List<com.zt.eureka_producer_user.dto.User>
         */
        User user = new User();
        user.setUsername(username);
        return userMapper.selectUserByName(user);
    }

    @Override
    public User queryUserById(Integer id) {
        /**
         * @description: 根据用户id精确查找用户
         * @author: invokerZt
         * @date: 2019-07-26 15:02
         * @param id:
         * @return: com.zt.eureka_producer_user.dto.User
         */
        User user = new User();
        user.setId(id);
        return userMapper.selectUserById(user);
    }

    @Override
    public int addUser(User user) {
        /**
         * @description: 创建用户
         * @author: invokerZt
         * @date: 2019-07-26 15:02
         * @param user:
         * @return: void
         */
        try {
            return userMapper.createUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("添加用户出错", e.getMessage());
        }
        return 0;
    }

    @Override
    public int updateUser(User user) {
        /**
         * @description: 修改用户信息
         * @author: invokerZt
         * @date: 2019-07-26 15:03
         * @param user:
         * @return: void
         */
        try {
            return userMapper.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("更新用户出错", e.getMessage());
            return 0;
        }
    }

    @Override
    public int deleteUser(Integer id) {
        /**
         * @description: 删除用户
         * @author: invokerZt
         * @date: 2019-07-26 15:03
         * @param id:
         * @return: void
         */
        User user = new User();
        user.setId(id);
        try {
            return userMapper.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("删除用户出错", e.getMessage());
        }
        return 0;
    }
}
