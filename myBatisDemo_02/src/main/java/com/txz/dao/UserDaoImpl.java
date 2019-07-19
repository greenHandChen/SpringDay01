package com.txz.dao;

        import com.txz.domain.User;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.mybatis.spring.support.SqlSessionDaoSupport;
        import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User finUserById(Integer id) {
        User user = this.getSqlSession().selectOne("test.findUserById", id);
        return user;
    }
}
