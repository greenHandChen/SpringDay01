package daoMapper;

import domain.User;
import domain.UserQueryVO;

import java.util.List;


public interface UserMapper {
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findByUserUserName(String username);
    int addUser(User user);
    int countUser(Integer sex);
    User findUserNameAndAddressById(Integer id);
    User testResultMap(Integer id);
    List<User> testActiveSql(User user);

    User findUserById(Integer id);

}
