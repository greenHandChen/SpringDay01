package com.hand.mapper;

import com.hand.pojo.User;
import com.hand.pojo.UserQueryVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     *
     * xml方式实现
     */
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
    User finUserNameAndAddressById(Integer id);
    User testResultMap(Integer id);
    List<User> testIfAndWhereLabel(User user);

    /**
     * 注解式方式实现
     */
    @Insert("insert into user(username, address,sex,birthday) values(#{username}, #{address},#{sex},#{birthday})")
    public int insertUser(User user);
    @Select("select * from user where id=#{id}")
    public User getUserById(int id);
}
