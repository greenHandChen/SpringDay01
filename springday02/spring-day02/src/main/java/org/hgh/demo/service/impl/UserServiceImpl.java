package org.hgh.demo.service.impl;

import org.hgh.demo.dao.impl.UserDao2;
import org.hgh.demo.pojo.User;
import org.hgh.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao2 userDao2;

    public void UpdateUser(User user) {
        userDao2.update(user);
    }

    public void DeleteUser(Long id) {
        userDao2.delete(id);
    }

    public Integer getCount() {
        Integer i = userDao2.getCount();
        return i;
    }

    public String getUsername(Long id) {
        String name = userDao2.getUsername(id);
        return name;
    }

    public List<User> getUsers(){
        return userDao2.getUsers();
    }


}
