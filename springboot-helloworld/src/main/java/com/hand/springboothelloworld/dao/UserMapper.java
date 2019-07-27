package com.hand.springboothelloworld.dao;

import com.hand.springboothelloworld.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/22 14:28
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where 1=1")
    List<User> findAllUser();

    @Results(
            {
                    @Result(property = "userId", column = "id")
            }
    )
    @Select("select user_id as id from t_user where username like #{username}")
    List<User> findbyUsername(@Param("username") String username);

    @Select("select * from t_user where user_id = #{userId}")
    User findUserById(@Param("userId") String userId);

    @Delete("delete from t_user where user_id= #{userId}")
    Long deleteUserById(@Param("userId") String userId);


    @SelectProvider(type = UserProvider.class, method = "listAll")
    List<User> findUserAllByProvider();

    @SelectProvider(type = UserProvider.class, method = "listUsername")
    List<User> listUserByName(@Param("username") String username);

    @Select("select * from t_user where 1=1")
    List<User> listSample();

    @Select("select * from t_user where username like #{username} and password like #{password} ")
    User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @SelectProvider(type = UserProvider.class, method = "getBadUser")
    User getBadUser(@Param("username") String username, @Param("password") String password);


}
