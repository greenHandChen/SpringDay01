package com.hand.handuserdetail.userdetail.service.impl;

import com.hand.handuserdetail.userdetail.dao.IUserDetailMapper;
import com.hand.handuserdetail.userdetail.entity.UserDetail;
import com.hand.handuserdetail.userdetail.service.IUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lwy
 * @version V1.0
 * @program: spring-cloud-exercise
 * @Description: TODO
 * @date 2019/7/26 18:53
 */
@Service
public class UserDetailServiceImpl implements IUserDetailService {

    @Autowired
    private IUserDetailMapper userDetailMapper;

    @Override
    public UserDetail findUserDetailById(Long userId) {
        return userDetailMapper.findUserDetailByUserId(userId);
    }

    @Override
    public Long addUserDetail(UserDetail userDetail) {
        return userDetailMapper.addUserDetail(userDetail);
    }

    @Override
    public Long delUserDetailByUserId(Long id) {
        return userDetailMapper.delUserDetailByUserId(id);
    }
}
