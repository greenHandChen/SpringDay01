package com.st.Mapper;

import com.st.domain.User;
import com.st.domain.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User selectUserById(Integer id);

    List<User> selectUserByUserName(String name);

    int addUser(User user);

    /**
     * 输入映射：包装pojo类型
     */
    List<User> findUserByUser(UserQueryVO userQueryVO);

    /**
     * 输入映射：map类型
     */
    List<User> findUserByMap(Map<String,String> map);

    /**
     * 输出映射：简单类型
     */
    int countUser();

    /**
     * 输出映射：pojo类型
     */
    User findUsernameAndAddressByID(Integer id);

    /**
     * 输出映射：resultMap类型
     */
    User resultMap(Integer id);

    /**
     * if、where标签
     */
    List<User> testLabel(User user);
}

