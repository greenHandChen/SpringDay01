package com.user_server.Controller;

import com.user_server.entity.User;
import com.user_server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/selectAll")
    public List<User> qureyAll()
    {
        List<User> list= userMapper.getAll();
        return  list;
    }
    @RequestMapping("/selectOne")
    public User qureyOen()
    {
        User user=userMapper.getOne(1);
        return user;
    }
    @RequestMapping("/add")
    public void add()
    {
        User user=new User();
        user.setUsername("XBS2");
        user.setAddress("CQ2");
        userMapper.add(user);
    }
    @RequestMapping("/update")
    public void update()
    {
        User user=new User();
        user.setId(1);
        user.setUsername("XBS111");
        user.setAddress("CQ111");
        userMapper.update(user);
    }
    @RequestMapping("/delete")
    public void delete()
    {
        userMapper.delete(2);
    }


}
