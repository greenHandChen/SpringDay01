package com.hand.integration.user.impl;

import com.hand.integration.user.IUserRepository;
import com.hand.integration.user.IUserService;
import com.hand.integration.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/22 19:12
 */
@Service
public class UserServiceImpl  implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAllUser() {
        return  iUserRepository.findAll();
    }
}
