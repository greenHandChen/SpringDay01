package com.lzn.mybatis.dao;

import com.lzn.mybatis.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * @Description 根据 id查询用户
     * @Param id
     * @Return 用户实体
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 16:48
     */
    UserEntity findUserById(Integer id);

    /**
     * @Description 根据用户名获取用户列表
     * @Param 
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 16:48
     */
    List<UserEntity> findUserByUsername(String username);

    /**
     * @Description 添加用户
     * @Param
     * @Return
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 16:59
     */
    int addUser(UserEntity user);
    
    
    /**
     * @Description map类型查询
     * @Param  * @param null
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:14
     */
    List<UserEntity> findUserByMap(Map<String, String> map);
    
    /**
     * @Description 查询用户数量
     * @Param  * @param null
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:22
     */
    int countUser();


    /**
     * @Description 根据Id获取用户名以及地址
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:26
     */
    UserEntity findUserNameAndAddressById(Integer id);
    
    /**
     * @Description 映射获取
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:35
     */
    UserEntity testResultMap(Integer id);

    /**
     * @Description 动态查询
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:40
     */
    List<UserEntity> testIfAndWhereLabel(UserEntity user);
}
