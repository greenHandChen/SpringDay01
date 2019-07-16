package com.hand.impl;

import com.hand.Dao.AddUserDao;
import org.springframework.stereotype.Repository;

@Repository("RepositoryDao")
public class RepositoryImpl implements AddUserDao {
    public void addUser() {
        System.out.println("添加用户成功");
    }
}
