package com.masirhh.mybatis2.service;

import com.masirhh.mybatis2.beans.userBean;
import com.masirhh.mybatis2.dao.userDao;
import com.masirhh.mybatis2.mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userService {

    @Resource
    userDao userDao;

    public userBean getUserById(Integer id){
        return userDao.findUserById(id);
    }
}
