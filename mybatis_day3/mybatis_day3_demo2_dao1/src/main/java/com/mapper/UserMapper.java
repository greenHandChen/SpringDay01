package com.mapper;

import com.domain.User;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:37 2019/7/18
 * @Modified By:
 */
public interface UserMapper {
    //mapper代理开发方式（使用的jdk的动态代理）
    //1.mapper接口的方法名称要和mapper的映射文件statement的id一致
    //2.mapper接口的方法参数类型要和mapper的映射文件的parameterType一致，参数只有一个
    //3.mapper接口的方法的返回值类型要和mapper的映射文件的resultType一致
    public User selectUserById(Integer id);

    public List<User> selectUsersByName(String name);

    public Integer addUser(User user);
}
