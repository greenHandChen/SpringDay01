package club.osai.mapper;

import club.osai.po.User;
import club.osai.vo.UserQueryVO;

import java.util.List;
import java.util.Map;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserMapper.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */

public interface UserMapper {
    User findUserById(Long id);

    List<User> findUserByUser(UserQueryVO userQueryVO);

    List<User> findUserByMap(Map<String, String> map);

    List<User> findUserByUsername(String username);

    int addUser(User user);

    long countUser();

    User findUsernameAndAddressById(Long id);
    User findUsernameAndAddressByIdWithMap(Long id);
    List<User> testIfAndWhereLabel(User user);
}
