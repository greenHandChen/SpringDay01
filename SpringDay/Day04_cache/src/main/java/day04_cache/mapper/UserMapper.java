package day04_cache.mapper;

import day04_cache.domain.User;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface UserMapper {
    public User findUserById(User user);

    public Integer addUser(User user);
}
