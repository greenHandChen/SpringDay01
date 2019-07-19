package com.yhk.ms.Dao.DaoImpl;

import com.yhk.ms.Dao.UserDao;
import com.yhk.ms.Pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }
}
