package com.hand.handmanageruser.user.dao;

import com.hand.handmanageruser.user.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IUserMapper {

    /**
     * @Description: 查找所有用户
     * @Param: []
     * @return: java.util.List<com.hand.handmanageruser.user.entity.User>
     * @Author: LWY
     * @Date: 2019/7/26 15:58
     */
    @Select("select user_Id,username,password from t_user")
    List<User> findAllUser();

    /**
     * @Description: 增加用户
     * @Param: [user]
     * @return: java.lang.Long
     * @Author: LWY
     * @Date: 2019/7/26 15:58
     */
    @Insert("insert into t_user(user_id,username,password) " +
            "values(#{user.userId},#{user.username},#{user.password}) ")
    Long addUser(@Param("user") User user);

    /**
     * @Description: 删除用户
     * @Param: [id]
     * @return: java.lang.Long
     * @Author: LWY
     * @Date: 2019/7/26 16:04
     */
    @Delete("delete from t_user where user_id = #{userId} ")
    Long delUserById(@Param("userId") Long userId);

    /**
     * @Description: 根据用户ID查找用户
     * @Param: [id]
     * @return: com.hand.handmanageruser.user.entity.User
     * @Author: LWY
     * @Date: 2019/7/26 16:04
     */
    @Select("select * from t_user where user_Id = #{userId} ")
    User findUserById(@Param("userId") Long userId);



}
