package mybatis.dao.daoMapper;

import mybatis.enity.User;
import mybatis.vo.UserQueryVO;

import java.util.List;
import java.util.Map;

/**
 * @Description: Mapper开发
 * @Author: TanLinQuan
 * @Date: 2019/7/18 16:26
 * @Version: V1.0
 **/
public interface UserMapper {

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

    /**
    * @Description: 综合查询
    * @Author: TanLinQuan
    * @Date: 2019/7/18 16:59
    * @params: [userQueryVO]
    * @return: java.util.List<mybatis.enity.User>
    **/
    List<User> findUserByUser(UserQueryVO userQueryVO);

    /**
    * @Description: 参数为MAP的查询语句
    * @Author: TanLinQuan
    * @Date: 2019/7/18 17:13
    * @params: [map]
    * @return: java.util.List<mybatis.enity.User>
    **/
    List<User> findUserByMap(Map<String,String> map);

    /**
    * @Description: 简单查询
    * @Author: TanLinQuan
    * @Date: 2019/7/18 17:18
    * @params: [sex]
    * @return: int
    **/
    int countUser(Integer sex);

    /**
    * @Description: 通过简单类型参数，查询返回POJO类型结果
    * @Author: TanLinQuan
    * @Date: 2019/7/18 18:18
    * @params: [id]
    * @return: mybatis.enity.User
    **/
    User findUserNameAndAddressById(Integer id);

    /**
    * @Description: 返回类型为resultMap
    * @Author: TanLinQuan
    * @Date: 2019/7/18 18:33
    * @params: [id]
    * @return: mybatis.enity.User
    **/
    User testResultMap(Integer id);

    /**
    * @Description: 动态Sql查询
    * @Author: TanLinQuan
    * @Date: 2019/7/18 18:47
    * @params: [user]
    * @return: java.util.List<mybatis.enity.User>
    **/
    List<User> testActiveSql(User user);

}
