package mybatis.dao.mybatisDao;

import mybatis.enity.User;

import java.util.List;

/**
 * @Description: Mybatis中原始dao编程
 * @Author: TanLinQuan
 * @Date: 2019/7/18 16:02
 * @Version: V1.0
 **/
public interface UserDao {

    /**
    * @Description: 根据Id查询用户
    * @Author: TanLinQuan
    * @Date: 2019/7/18 16:04
    * @params: [id]
    * @return: mybatis.enity.User
    **/
    User findUserById(Integer id);

    /**
    * @Description: 根据用户名获取用户列表
    * @Author: TanLinQuan
    * @Date: 2019/7/18 16:04
    * @params: [username]
    * @return: java.util.List<mybatis.enity.User>
    **/
    List<User> findUserByUsername(String username);

    /**
    * @Description: 添加用户
    * @Author: TanLinQuan
    * @Date: 2019/7/18 16:05
    * @params: []
    * @return: int
    **/
    int addUser(User user);
}
