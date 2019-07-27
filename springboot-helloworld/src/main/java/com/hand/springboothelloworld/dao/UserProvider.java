package com.hand.springboothelloworld.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/22 15:53
 */
public class UserProvider {

    public String listAll()
    {
        return "select * from t_user where 1=1";
    }

    public String listUsername(String username)
    {
        return "select * from t_user where username = #{username}";
    }

    public String getBadUser(@Param("username") String username ,@Param("password") String password)
    {
        return new SQL(){{
         SELECT("*");
         FROM("t_user");
         if(username != null && password != null) {
             WHERE("username = #{username} and password = #{password}");
         }
         else {
             WHERE("1=2");
         }
        }}.toString();



    }

}

