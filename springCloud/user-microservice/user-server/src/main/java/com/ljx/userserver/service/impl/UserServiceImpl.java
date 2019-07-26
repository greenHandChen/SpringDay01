package com.ljx.userserver.service.impl;

import com.ljx.userserver.domain.User;
import com.ljx.userserver.repository.UserRepository;
import com.ljx.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 9:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id){
       return userRepository.findById(id).get();
    }

    @Override
    public List<User> findByIds(List<Integer> ids) {
        return userRepository.findByIdIn(ids);
    }

    @Override
    public List<User> findByAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }


    @Override
    @Transactional
    public void updateUserById(User user) {
        User user1 = userRepository.findById(user.getId()).get();
        if (user.getUsername() != null){
            user1.setUsername(user.getUsername());
        }
        if (user.getBirthday() != null ){
            user1.setBirthday(user.getBirthday());
        }

        userRepository.save(user1);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
