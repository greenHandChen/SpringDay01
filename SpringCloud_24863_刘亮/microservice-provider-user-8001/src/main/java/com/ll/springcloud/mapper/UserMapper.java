package com.ll.springcloud.mapper;

import com.ll.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @package com.ll.springcloud.mapper
 * @Author LL
 * @ClassName UserMapper
 * @Date 2019/7/26  15:38
 */

@Mapper
public interface UserMapper {

    //根据id查找单个用户
    public User findUserById(int id);

    //查找所有用户
    public List<User> findUserList();

    //添加用户
    public void addUser(User user);

    //更新用户
    public void updateUser(User user);

    //删除用户
    public void deleteUserById(int id);


}
