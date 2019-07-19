package mapper;

import damain.User;


import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
    List<User> findUserByMap(Map<String, String> map);
    int countUser();
    User findUserNameAndAddressById(Integer id);
    User testResultMap(Integer id);
    List<User> testIfAndWhereLabel(User user);

}
