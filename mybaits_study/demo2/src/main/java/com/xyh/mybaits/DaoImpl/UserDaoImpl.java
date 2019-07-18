package com.xyh.mybaits.DaoImpl;

import com.xyh.mybaits.Dao.UserDao;
import com.xyh.mybaits.Entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        User user=sqlSession.selectOne("user.findUserById",id);

        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String name) {

        SqlSession sqlSession=sqlSessionFactory.openSession();

        List<User> users=sqlSession.selectList("user.findUserByName",name);

        sqlSession.close();
        return users;
    }

    @Override
    public void addUser(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.insert("user.addUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateById(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.update("user.updateById",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.delete("user.deleteById",id);
        sqlSession.commit();
        sqlSession.close();
    }
}
