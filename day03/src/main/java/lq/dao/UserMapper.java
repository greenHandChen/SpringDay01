package lq.dao;

import lq.pojo.User;
import lq.pojo.User2;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);

    List<User> findUserByUsername(String name);

    int insertUser(User user);

    int insertUserGetId(User u);
    List<User2> testWhere(User2 user);
}
