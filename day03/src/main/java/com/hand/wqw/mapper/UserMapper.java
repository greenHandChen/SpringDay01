package com.hand.wqw.mapper;

import com.hand.wqw.domain.User;
import com.hand.wqw.vo.UserQueryVo;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User selectUserById(Integer id);
    List<User> selectUsersLikeUserName(String username);
    int insertUser(User user);
    List<User> findByQueryVo(UserQueryVo vo);
    User findUsernameAddressById(Integer id);
    List<User> findByMap(Map map);

}
