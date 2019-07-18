package com.st.BeforeDao;

import com.st.domain.User;

import java.util.List;

public interface UserDao {

    User findUserById(Integer id);

    List<User> findUserByName(String name);

    int addUser(User user);


}
