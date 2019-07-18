package mybatis.dao.mybatisDao.impl;

import mybatis.dao.mybatisDao.UserDao;
import mybatis.enity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/18 16:05
 * @Version: V1.0
 **/
public class UserDaoImpl implements UserDao {

//  全局唯一，伪注入
    private SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User findUserById(Integer id) {
        User user = sqlSession.selectOne("dao.findUserById", 1);
        return user;
    }

    public List<User> findUserByUsername(String username) {
        List<User> user = sqlSession.selectList("dao.findByUserUserName", "张");
        return user;
    }

    public int addUser(User user) {
        int row = sqlSession.insert("dao.addUser", user);
        sqlSession.commit();
        return row;
    }
}
