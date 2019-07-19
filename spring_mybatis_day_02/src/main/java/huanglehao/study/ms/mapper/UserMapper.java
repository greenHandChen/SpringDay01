package huanglehao.study.ms.mapper;


import huanglehao.study.ms.po.User;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:17 2019/7/18
 */
public interface UserMapper {
    //1.根据用户id查询用户信息
    public User findUserById(int id) throws  Exception;

}
