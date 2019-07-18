package com.lzn.mybatis.dao.imp;

import com.lzn.mybatis.dao.IUserDao;
import com.lzn.mybatis.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImp implements IUserDao {

    // 全局唯一，整合到 spring之后，使用单例
    private SqlSessionFactory sqlSessionFactory;

    // 模拟 spring的 setter方式注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public UserEntity findUserById(Integer id) {
        // 获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 执行查询，第一个参数是命名空间，sql的 ID，第二个参数是查询步骤
        UserEntity user = sqlSession.selectOne("test.findUserById", id);

        // 关闭 sqlSession（释放连接）
        sqlSession.close();
        return user;
    }

    public List<UserEntity> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<UserEntity> users = sqlSession.selectList("test.findUserByUsername", "%" + username + "%");
        sqlSession.close();
        return users;
    }

    public int addUser(UserEntity user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int rows = sqlSession.insert("test.addUser", user);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }
}
