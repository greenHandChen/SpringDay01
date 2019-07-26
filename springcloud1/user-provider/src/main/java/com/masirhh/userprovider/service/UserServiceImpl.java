package com.masirhh.userprovider.service;

import com.masirhh.countryprovider.beans.Country;
import com.masirhh.userprovider.beans.User;
import com.masirhh.userprovider.beans.UserExt;
import com.masirhh.userprovider.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserExtService UserExtService;

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public UserExt findUserExt(Integer id) {
        User userById = userMapper.findUserById(id);
        Country countryById = UserExtService.findCountryById(userById.getCountryid());
        UserExt userExt=new UserExt();
        userExt.setUsername(userById.getUsername());
        userExt.setId(userById.getId());
        userExt.setCountryid(userById.getCountryid());
        userExt.setCountry(countryById);
        return userExt;
    }

}
