package com.hand.service;

import com.hand.entity.User;
import com.hand.entity.UserExit;
import com.hand.entity.UserOrders;

import java.util.List;
import java.util.Map;

public interface IUserService {

    public List<User> getAllUser();

    public int addUser(User user);

    public int removeUser(User user);

    public int modifyUser(User user);

    public User getUserById(int id);

    public List<Map<Integer,User>> getAllUserMap();

    public int changeName(int user1_id, int user2_id);

    public List<UserOrders> getUser_OrdersByUserId(int user_id);
    public List<UserExit> getUser_OrdersByUserIduseExit(int user_id);
}
