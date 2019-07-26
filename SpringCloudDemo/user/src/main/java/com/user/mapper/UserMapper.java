package com.user.mapper;

import com.user.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
@Repository
public interface UserMapper {

    User getUser(Integer id);

    Integer updateUser(User user);
//
    Integer deleteUserById(Integer id);

    Integer insertUser(User user);
}
