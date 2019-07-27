package com.example.service2.servicetwo;

import com.example.service2.dao.UserDetailDao;
import com.example.service2.dto.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    private UserDetailDao userDetailDao;
    @Override
    public UserDetail findById(Long id) {
        return userDetailDao.findByUserId(id);
    }

    @Override
    public List<UserDetail> findAll() {
        return userDetailDao.findAll();
    }

    @Override
    public void delete(Long id) {
        userDetailDao.deleteById(id);
    }

    @Override
    public void add(UserDetail userDetail) {
        userDetailDao.save(userDetail);
    }

    @Override
    public void update(UserDetail userDetail) {
        userDetailDao.save(userDetail);
    }
}
