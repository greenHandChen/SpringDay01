package com.masirhh.userprovider.mappers;

import com.masirhh.userprovider.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<User> findAll();

    User findUserById(Integer id);

    void addUser(User user1);

    void updateUser(User user);

    void deleteUser(Integer id);


}
