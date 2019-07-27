/**
 * Created by Hsl
 * 2019/7/26 17:05
 */
package com.hand.provider.Service;

import com.hand.provider.mapper.UserMapper;
import com.hand.provider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @Override
    public User findUserById(Integer id) {

        return userMapper.findUserById(id);

    }

    @Override
    public void addUser(User user) {

        userMapper.addUser(user);
    }


}
