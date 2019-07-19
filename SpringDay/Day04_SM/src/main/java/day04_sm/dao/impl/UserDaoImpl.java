package day04_sm.dao.impl;

import day04_sm.dao.UserDao;
import day04_sm.domain.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserById(Integer id) {
        return getSqlSession().selectOne("test.findUserById",id);
    }
}
