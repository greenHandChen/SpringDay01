package com.hand.service.impl;

import com.hand.bean.SysUser;
import com.hand.dao.impl.UserDaoImpl;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;

    public void changePSW(String username,String newPSW){
        userDaoImpl.updatePasswordByUsername(username,newPSW);
    }

}
