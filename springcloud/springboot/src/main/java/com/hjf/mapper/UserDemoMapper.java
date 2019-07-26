package com.hjf.mapper;

import com.hjf.pojo.UserDemo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDemoMapper{
    List<UserDemo> queryUserDemo();
}
