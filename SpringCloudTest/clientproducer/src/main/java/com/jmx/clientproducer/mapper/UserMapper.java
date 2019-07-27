package com.jmx.clientproducer.mapper;

import com.jmx.clientproducer.model.UserDemo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
       public void insertUser(UserDemo userDemo);
       public List<UserDemo> queryUser();


}
