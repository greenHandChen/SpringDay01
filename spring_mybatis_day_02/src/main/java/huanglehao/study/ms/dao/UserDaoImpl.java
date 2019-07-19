package huanglehao.study.ms.dao;

import huanglehao.study.ms.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 16:17 2019/7/19
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements  UserDao {
    public User findUserById(int id) throws Exception {
        return this.getSqlSession().selectOne("user.findUserById",id);
    }
}
