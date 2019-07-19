package com.hand.wqw.dao.daoimpl;

import com.hand.wqw.dao.UserDao;
import com.hand.wqw.domain.User;
import com.hand.wqw.vo.UserOrderVo;
import com.hand.wqw.vo.UserQueryVo;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    @Override
    public User selectUserById(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        User o = sqlSession.selectOne("test.selectUserById", 1);
        return o;
    }

    @Override
    public List<User> selectUsersLikeUserName(String username) {
        SqlSession sqlSession = this.getSqlSession();
        List<User> us = sqlSession.selectList("test.selectUsersLikeUserName", "'%小%'");
        return us;
    }

    /**
     *除id在其他属性全部插入
     * @param user
     * @return
     */
    @Override
    public int insertUser(User user) {
        SqlSession sqlSession = this.getSqlSession();
        int insert = sqlSession.insert("test.insertUser", user);
        return insert;
    }

    /**
     * sex精确匹同时address模糊匹配
     * @param vo
     * @return
     */
    @Override
    public List<User> findByQueryVo(UserQueryVo vo) {
       SqlSession sqlSession = this.getSqlSession();
        List<User> objects = sqlSession.selectList("test.findByQueryVo", vo);
        return objects;
    }

    @Override
    public User findUsernameAddressById(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        User o = sqlSession.selectOne("test.findUsernameAddressById", id);
        return o;
    }

    /**
     * username 模糊匹配
     * @param map
     * @return
     */
    @Override
    public List<User> findByMap(Map map) {
        SqlSession sqlSession = this.getSqlSession();
        List<User> objects = sqlSession.selectList("test.findByMap", map);
        return objects;
    }

    @Override
    public UserOrderVo findUserOrders(Integer userId) {
        SqlSession sqlSession = this.getSqlSession();
        UserOrderVo o = sqlSession.selectOne("test.findUserOrders", userId);
        return o;
    }
}
