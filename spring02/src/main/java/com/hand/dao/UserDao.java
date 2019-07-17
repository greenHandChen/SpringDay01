package com.hand.dao;

import com.hand.bean.SysUser;

public interface UserDao {

    void updatePasswordByUsername(String username,String newPSW);

}
