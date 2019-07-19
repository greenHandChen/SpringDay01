package huanglehao.study.mapper;

import huanglehao.study.po.User;
import huanglehao.study.po.UserQueryVo;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:17 2019/7/18
 */
public interface UserMapper {
    //1.根据用户id查询用户信息
    public User findUserById(int id) throws  Exception;
    //3.添加用户
    public void insertUser(User user) throws  Exception;

    //综合查询
    public List<User> findUserList(UserQueryVo vo);

    //综合查询用户总数
    public int findUserCount(UserQueryVo vo);

    public User findUserResultMap(int id);
}
