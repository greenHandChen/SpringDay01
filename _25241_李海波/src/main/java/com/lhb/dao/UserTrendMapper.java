package com.lhb.dao;

import com.lhb.domain.User;
import com.lhb.vo.UserVO;

import java.util.List;

public interface UserTrendMapper {

    List<User> testIfAndWhereLabel(UserVO userVo);

}
