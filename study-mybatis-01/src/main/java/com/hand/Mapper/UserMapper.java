package com.hand.Mapper;

import com.hand.Entity.User;

public interface UserMapper {

    public User selectUserById(int id);

    public User selectUserByName(String username);

    public void insertUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);


}
