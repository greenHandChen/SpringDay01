package huanglehao.study.dao;

import huanglehao.study.po.User;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:17 2019/7/18
 */
public interface UserDao {
    //1.根据用户id查询用户信息
    public User findUserById(int id) throws  Exception;
    //2.根据用户名模糊查询用你号列表
    public List<User> findUsersByName(String name) throws  Exception;

    //3.添加用户
    public void insert(User user) throws  Exception;

}
