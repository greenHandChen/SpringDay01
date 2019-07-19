package day04_sm.dao;

import day04_sm.domain.User;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
public interface UserDao {
    User findUserById(Integer id);
}
