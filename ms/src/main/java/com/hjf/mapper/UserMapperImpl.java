package com.hjf.mapper;

import com.hjf.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * ClassName:UserMapperImp
 * Author:Hejunfeng
 * Date:2019/7/20 8:34
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

        public User findUserById(Integer id) {
            return getSqlSession().selectOne("findUserById");
        }

}