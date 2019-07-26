package com.hand.user.service.impl;

import com.hand.user.dao.UserMapper;
import com.hand.user.dao.feign.CountryFeign;
import com.hand.user.domain.Country;
import com.hand.user.domain.User;
import com.hand.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CountryFeign countryFeign;

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        if(users!=null){
            for (User u:users) {
                if(u.getCountryId()==null){
                    continue;
                }
                Country country = countryFeign.findById(u.getCountryId());
                if(country!=null){
                    u.setCountryName(country.getCountryName());
                }
            }
        }
        return users;
    }

    @Override
    public User findById(Integer id) {
        User user = userMapper.findById(id);
        if(user!=null && user.getCountryId()!=null){
            Country country = countryFeign.findById(user.getCountryId());
            if(country!=null){
                user.setCountryName(country.getCountryName());
            }
        }
        return user;
    }

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateById(user);
    }
}
