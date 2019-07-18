package com.hand.mapper;

import com.hand.entity.QueryUser;
import com.hand.entity.User;
import com.hand.entity.UsersOrders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {
    /**
     * 通过ID查询用户
     *
     * @param id
     * @return
     */
    @Select("select id,username,birthday,sex,address from user where id=#{id}")
    public User selectUserById(int id);

    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    public int updateUser(User user);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    public int insertUser(User user);

    /**
     * 查询所有用户
     *
     * @return
     */
    @Select("select id,username,birthday,sex,address from user")
    public List<User> selectAllUser();

    /**
     * 通过ID删除用户
     *
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    public int deleteUserById(int id);

    /**
     * 使用resultMap方式查询用户，在mapper.xml中不要求查询列名与属性名相同--可自定义查询结果的列名
     *
     * @param id
     * @return
     */
    public User selectUserToMapById(int id);

    /**
     * 通过映射User对象查询
     *
     * @param queryUser
     * @return
     */
    public List<User> selectUserByUserSex(QueryUser queryUser);

    /**
     * 动态SQL查询
     *
     * @param user
     * @return
     */
    public List<User> selectUserUncheck(User user);

    /**
     * 一对多查询
     *
     * @param id
     * @return
     */
    public List<UsersOrders> selectUserAndOrders(int id);

}
