package com.hand.service;

import com.hand.entity.User;
import com.hand.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
     * 名字转换
     *
     * @param user1
     * @param user2
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int changeName(User user1, User user2) {
        String tmpName = user1.getUsername();
        user1.setUsername(user2.getUsername());
        int flag1 = 0, flag2 = 0;
        flag1 = userMapper.updateUser(user1);
        user2.setUsername(tmpName);
        flag2 = userMapper.updateUser(user2);
        return flag1 == flag2 ? flag1 : 0;
    }
}
