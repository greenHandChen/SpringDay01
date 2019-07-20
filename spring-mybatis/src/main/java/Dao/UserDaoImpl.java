package Dao;

import Entity.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl /* extends SqlSessionDaoSupport */ implements UserDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public User findUserById(Integer id) {

        // return this.getSqlSession().selectOne("UserMapper.findUserById", id);

        return sqlSessionFactory.openSession().selectOne("UserMapper.findUserById", id);

    }
}
