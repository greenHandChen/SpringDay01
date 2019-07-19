package Mapper;

import Entity.User;
import Entity.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserId(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
    List<User> findUserList(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map map);
    int countUser();
    User findUsernameAndAddressById(int id);
    User findUserRstMap(int id);
    List<User> testIfAndWhereLabel(User user);
    List<User> testForEach(List list);
}
