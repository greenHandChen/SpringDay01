package com.lhb.mapper;

import com.lhb.domain.User;
import com.lhb.domain.UserQueryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created By LHB on 2019/7/18;
 */
public interface UserMapper {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 根据用户名获取用户列表
     * @param username
     * @return
     */
    List<User> findUserByUsername(String username);

    int addUser(User user);

    /**
     * 综合查询
     * @param userQueryVO
     * @return
     */
    List<User> findUserByUser(UserQueryVO userQueryVO);

    /**
     * map查询
     * @param map
     * @return
     */
    List<User> findUserByMap(Map<String,String> map);

}
