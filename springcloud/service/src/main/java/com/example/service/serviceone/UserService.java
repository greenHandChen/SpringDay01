package com.example.service.serviceone;

import com.example.service.dto.User;

import java.util.List;

public interface UserService {
     List<User> getUserList();

     User findUserById(long id);

     void save(User user);

     void edit(User user);

     void delete(long id);
}
