package huanglehao.study.usermanagerservice.mapper;


import huanglehao.study.pojomodul.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 11:15 2019/7/26
 */
public interface UserMapper {

    //增加一个用户
    public void addUser(User user);

    //删除一个用户
    public void deleteById(int id);

    //修改
    public void updateUser(User user);

    //查询所有的用户
    public List<User> selectUserList();


}
