package com.ljx.userserver.service;

import com.ljx.userserver.domain.User;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 9:52
 */
public interface UserService {

    User findById(Integer id);

    /**
     *功能描述  根据id查询用户
     * @author LJX
     * @date 2019/7/26  11:06
     * @param ids
     * @return java.util.List<com.ljx.userserver.domain.User>
     */
    List<User> findByIds(List<Integer> ids);

    /**
     *功能描述  获取所有用户
     * @author LJX
     * @date 2019/7/26  11:06
     * @param
     * @return java.util.List<com.ljx.userserver.domain.User>
     */
    List<User> findByAll();

    /**
     *功能描述  过根据id删除用户
     * @author LJX
     * @date 2019/7/26  11:06
     * @param id
     * @return void
     */
    void deleteUserById(Integer id);

    /**
     *功能描述  修改用户信息
     * @author LJX
     * @date 2019/7/26  11:07
     * @param user
     * @return void
     */
    void updateUserById(User user);

    /**
     *功能描述   添加用户
     * @author LJX
     * @date 2019/7/26  11:07
     * @param user
     * @return void
     */
    void addUser(User user);
}
