package org.hgh.dao.mapper;

import org.hgh.pojo.User;
import org.hgh.vo.UserVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int addUser(User user);

    List<User> findUserByUser(UserVO userVO);

    List<User> findUserByAddressAndSex(UserVO userVO);

    List<User> findUserByMap(Map<String,Object> map);

    int getUserCounts();

    User findUsernameAndAddressById(Integer id);

    List<User> testResultMap();

}