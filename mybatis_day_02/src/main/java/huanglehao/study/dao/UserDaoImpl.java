package huanglehao.study.dao;

import huanglehao.study.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:23 2019/7/18
 */
public class UserDaoImpl implements  UserDao {

   //依赖注入
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) {

        //创建sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //调用sqlsession的增删改查方法
        User user=sqlSession.selectOne("user.findUserById",id);
        //关闭资源
        sqlSession.close();

        return user;
    }

    public List<User> findUsersByName(String name) {
        //创建sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //调用sqlsession的增删改查方法
        List<User> userList=sqlSession.selectList("user.findUserByName",name);
        //关闭资源
        sqlSession.close();

        return userList;
    }

    public void insert(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //调用sqlsession的增删改查方法
        sqlSession.insert("user.insertUser2",user);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}
