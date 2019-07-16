package com.hand.DAO.impl;

import com.hand.DAO.UserDAO;
import com.hand.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    private User user;

    public void addUser() {
        user.setUserID(25569);
        user.setUsername("翁振霖");
        user.setPassword("112233");

        System.out.println(user.toString());

    }
}
