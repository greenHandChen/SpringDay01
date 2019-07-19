package club.osai.mapper;

import club.osai.po.User;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserMapper.java
 * @Version: 1.0
 * @Date: 2019/7/19
 * @Description:
 */

public interface UserMapper {

    User findUserById(Long id);
}
