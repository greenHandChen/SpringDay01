package com.wpb.service;

import com.wpb.dao.UserDao;
import com.wpb.entity.OrderExt;
import com.wpb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<OrderExt> findOrderExts(){
        return  userDao.findOrderExts();
    }
}
