package club.osai.dao;

import club.osai.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserDaoImpl.java
 * @Version: 1.0
 * @Date: 2019/7/19
 * @Description:
 */

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUser(Long id) {

        User user = (User) getSqlSession().selectOne("club.osai.dao.UserDao.findUserById", id);

        return user;
    }
}
