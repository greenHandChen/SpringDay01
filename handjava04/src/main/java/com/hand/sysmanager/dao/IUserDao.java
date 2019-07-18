package com.hand.sysmanager.dao;

import com.hand.sysmanager.entity.User;
import com.hand.sysmanager.entity.UserQueryVO;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: LWY
 * @Date: 2019/7/18 15:25
 */
public interface IUserDao {

    /**
     * @Description: 通过userId查找user
     * @Param: [userId]
     * @return: com.hand.sysmanager.entity.User
     * @Author: LWY
     * @Date: 2019/7/18 16:00
     */
    User findUserById(Long userId);

    /**
     * @Description: 模糊查找用户
     * @Param: [username]
     * @return: java.util.List<com.hand.sysmanager.entity.User>
     * @Author: LWY
     * @Date: 2019/7/18 16:00
     */
    List<User> findUserByUsername(String username);

    /**
     * @Description: 增加用户
     * @Param: [user]
     * @return: java.lang.Long
     * @Author: LWY
     * @Date: 2019/7/18 16:01
     */
    Long addUser(User user);

    Long addUserGetId(User user);

    Long addUserGetUUID(User user);

    List<User> findUserByUser(UserQueryVO userQueryVO);

    List<User> findUserByMap(Map<String,String> map);

    int countUser();

    User findusernameAndAddressById(Long id);

    User findUserByIdMap(Long id);

    List<User> testIfAndWhereLabel(User user);
}
