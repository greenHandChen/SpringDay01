package com.hand.dao;

import com.hand.entity.User;
import com.hand.entity.UserQueryVO;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/18
 */
public interface UserDao {
    /**
     * @author:  HuangHeng
     * @description  根据用户id查询用户信息
     * @CreateDate:  2019/7/18
     */
    User findUserById(Integer id);
    /**
     * @author:  HuangHeng
     * @description  根据 username 模糊查询
     * @CreateDate:  2019/7/18
     */
    List<User> findUserByUsername(String username);
    /**
     * @author:  HuangHeng
     * @description  插入数据返回 主键id
     * @CreateDate:  2019/7/18
     */
    int addUser(User user);

    List<User> findUserByUser(UserQueryVO userQueryVO);
}
