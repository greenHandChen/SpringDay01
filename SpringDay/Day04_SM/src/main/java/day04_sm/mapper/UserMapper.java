package day04_sm.mapper;

import day04_sm.domain.User;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface UserMapper {
    User findUserById(Integer id);
}
