package com.springbootdemo.mapper;

import com.springbootdemo.dto.UserDemo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDemoMapper {
    List<UserDemo> queryUserDemo();
}
