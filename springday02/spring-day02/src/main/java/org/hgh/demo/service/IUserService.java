package org.hgh.demo.service;

import org.hgh.demo.pojo.User;

import java.util.List;

public interface IUserService {
    void UpdateUser(User user);

    void DeleteUser(Long id);

    Integer getCount();

    String getUsername(Long id);

    List<User> getUsers();
}
