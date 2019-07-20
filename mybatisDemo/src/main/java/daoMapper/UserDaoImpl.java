package daoMapper;

import domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    //使用dao模式开发。
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("daoMapper.UserDao.findUserById",id);
    }
}
