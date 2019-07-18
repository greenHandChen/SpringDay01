package SpringDay.dao;

import SpringDay.domain.User;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/18.
 */
public interface UserDao {

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
