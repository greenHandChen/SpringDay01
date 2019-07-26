package app.service;

import app.dao.UserMapper;
import entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: wuhui
 * @time: 2019/7/26 18:17
 * @desc:
 */
@Service
public class UserService {
    @Resource
    UserMapper mapper;

    public User selectUserById(Integer id){
        return mapper.selectById(id);
    }
    public void addUser(User user){
        mapper.insert(user);
    }
    public void deleteUserById(Integer id){
        mapper.deleteById(id);
    }
    public void updateUser(User user){
        mapper.updateById(user);
    }
}
