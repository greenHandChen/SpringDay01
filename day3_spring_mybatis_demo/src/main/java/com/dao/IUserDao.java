package com.dao;

import com.domain.User;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 20:46 2019/7/18
 * @Modified By:
 */
public interface IUserDao {
    User findUserById(Integer id);
}
