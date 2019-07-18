package com.xyh.mybaits.Mapper;

import com.xyh.mybaits.Entity.User;
import com.xyh.mybaits.Entity.UserQuery;

import java.util.List;

public interface UserMapper {

    public User findUserById(Integer id);

    public List<User> findUserByName(String name);

    public void addUser(User user);

    //    综合查询,映射输入
    public List<User> findUserByUserQuery(UserQuery userQuery);

    //    综合查询,映射输出
    public User findUserRstById(Integer id);

    //    综合查询，动态sql+sql片段
    public List<User> findUserByCondition(User user);

    //    综合查询,根据集合查询
    public List<User> findUserByIds(List<Integer> ids);

    public void updateById(User user);

    public void deleteById(Integer id);
}
