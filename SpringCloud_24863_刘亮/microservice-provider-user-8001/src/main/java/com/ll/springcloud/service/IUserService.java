package com.ll.springcloud.service;

import com.ll.springcloud.entities.User;

import java.util.List;

/**
 * @package com.ll.springcloud.service
 * @Author LL
 * @ClassName IUserService
 * @Date 2019/7/26  15:48
 */
public interface IUserService {

    public User findUserById(int id);

    public List<User>  findAllUsers();

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);
}
