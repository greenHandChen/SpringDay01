package huanglehao.study.ms.dao;

import huanglehao.study.ms.po.User;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 16:16 2019/7/19
 */
public interface UserDao {

    //查询
    public User findUserById(int id) throws  Exception;

}
