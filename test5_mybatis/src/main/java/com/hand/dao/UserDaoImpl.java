package com.hand.dao;

import com.hand.entity.User;
import com.hand.entity.UserQueryVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/18
 */
public class UserDaoImpl implements UserDao{

    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }
    /**
     * @author:  HuangHeng
     * @description  根据用户id查询用户信息
     * @CreateDate:  2019/7/18
     */
    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return  (User)sqlSession.selectOne("findUserById", id);
    }
    /**
     * @author:  HuangHeng
     * @description  根据 username 模糊查询
     * @CreateDate:  2019/7/18
     */
    @Override
    public List<User> findUserByUsername(String username) {
        List<User> list =null;
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            list = sqlSession.selectList("findUserByLikeUserName",("%"+username+"%"));
            System.out.println("findUserByLikeUserName----->"+list);
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }
        return list;
    }
    /**
     * @author:  HuangHeng
     * @description  插入数据返回 主键id
     * @CreateDate:  2019/7/18
     */
    @Override
    public int addUser(User user) {
        SqlSession sqlSession =null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            sqlSession.insert("insertUserReturnId",user);
            sqlSession.commit();
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }finally {
            sqlSession.close();
        }
        return user.getId();
    }

    @Override
    public List<User> findUserByUser(UserQueryVO userQueryVO) {
        List<User> list =null;
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserDaoImpl mapper = sqlSession.getMapper(UserDaoImpl.class);
            list = mapper.findUserByUser(userQueryVO);
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }
        return list;
    }
}
