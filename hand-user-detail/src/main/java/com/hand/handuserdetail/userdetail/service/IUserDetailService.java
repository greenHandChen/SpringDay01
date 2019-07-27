package com.hand.handuserdetail.userdetail.service;

import com.hand.handuserdetail.userdetail.entity.UserDetail;

public interface IUserDetailService {

    UserDetail findUserDetailById(Long userId);

    Long addUserDetail(UserDetail userDetail);

    Long delUserDetailByUserId(Long userId);
}
