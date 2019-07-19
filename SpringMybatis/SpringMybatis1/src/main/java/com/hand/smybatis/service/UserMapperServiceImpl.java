package com.hand.smybatis.service;

import com.hand.smybatis.mapper.UserMapper;
import com.hand.smybatis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapperServiceImpl implements UserMapperService {



    public User findUserById(Integer id) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = ac.getBean(UserMapper.class);
        //		UserMapper mapper = (UserMapper) ac.getBean("UserMapper");
        User user = mapper.findUserById(10);
        return user;
    }

    public List<User> selectMoreByMore() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = ac.getBean(UserMapper.class);
        //		UserMapper mapper = (UserMapper) ac.getBean("UserMapper");
        List<User> user1 = mapper.selectMoreByMore();
        return user1;
    }

}
