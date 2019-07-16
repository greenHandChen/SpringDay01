package com.hand.impl;

import com.hand.Dao.AddUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.hand.svc.AddUserSvc;
@Service
public class AddUserImpl implements AddUserSvc {
    @Autowired
    @Qualifier("RepositoryDao")
    private AddUserDao addUserDao;
    public void addUser() {
        System.out.println("开始添加用户");
        addUserDao.addUser();
    }
}
