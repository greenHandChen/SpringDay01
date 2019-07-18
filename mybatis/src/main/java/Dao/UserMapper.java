package Dao;

import Domin.User;
import Vo.UserQueryVo;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findUserById(String id);

    List<User> findUserByUsername(String username);

    List<User> findUserByUser(UserQueryVo userQueryVo);

    int addUser(User user);

    List<User> findUserByMap(Map map);

    List<User> testIfAndWhereLabel(User user);
}
