package dao;

import domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    public User findUserByUserId(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById", id);
    }
}
