package com.hand.sysmanager.dao.impl;

import com.hand.sysmanager.dao.IUserDao;
import com.hand.sysmanager.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/18 16:50
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao
{



    public User findUserById(Long userId) {
       return this.getSqlSession().selectOne("com.hand.sysmanager.dao.IUserDao.findUserById",userId);

    }

}
