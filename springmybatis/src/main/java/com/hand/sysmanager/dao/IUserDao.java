package com.hand.sysmanager.dao;

import com.hand.sysmanager.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: LWY
 * @Date: 2019/7/18 15:25
 */
public interface IUserDao {
  

    /**
     * @Description: 根据用户ID查找用户
     * @Param: [userId]
     * @return: com.hand.sysmanager.entity.User
     * @Author: LWY
     * @Date: 2019/7/19 16:00
     */
    User findUserById(@Param("userId") Long userId);


}
