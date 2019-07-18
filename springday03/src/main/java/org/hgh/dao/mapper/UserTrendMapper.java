package org.hgh.dao.mapper;

import org.hgh.pojo.User;
import org.hgh.vo.UserVO;

import java.util.List;

public interface UserTrendMapper {

    List<User> testIfAndWhereLabel(UserVO userVo);

}
