package com.hand.mapper;

import com.hand.entity.QueryUser;
import com.hand.entity.User;
import com.hand.entity.UsersOrders;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    User selectUserById(int id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    @Select("select id,username,birthday,sex,address from user")
    List<User> selectAllUser();

    /**
     * 通过ID删除用户
     * @param id
     * @return
     */
    int deleteUserById(int id);

    /**
     * 使用resultMap方式查询用户，在mapper.xml中不要求查询列名与属性名相同--可自定义查询结果的列名
     * @param id
     * @return
     */
    User selectUserToMapById(int id);

    /**
     * 通过映射User对象查询
     * @param queryUser
     * @return
     */
    List<User> selectUserByUserSex(QueryUser queryUser);

    /**
     * 动态SQL查询
     * @param user
     * @return
     */
    List<User> selectUserUncheck(User user);

    /**
     * 一对多查询
     * @param id
     * @return
     */
    List<UsersOrders> selectUserAndOrders(int id);

}
