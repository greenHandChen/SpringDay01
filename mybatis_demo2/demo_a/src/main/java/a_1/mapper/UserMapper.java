package a_1.mapper;

import a_1.domain.User;

import javax.xml.ws.soap.MTOM;

public interface UserMapper {

    /**
     * @Author: MikeLv
     * @Description: 根据ID查询用户信息
     * @Date: 2019/7/19 14:12
     */
    User findUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 添加用户
      * @Date: 2019/7/19 16:13
      */
    Integer addUser(User user);
}
