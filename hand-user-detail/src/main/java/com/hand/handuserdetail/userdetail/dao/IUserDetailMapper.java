package com.hand.handuserdetail.userdetail.dao;

import com.hand.handuserdetail.userdetail.entity.UserDetail;
import org.apache.ibatis.annotations.*;

/**
 * @author LWY
 */
@Mapper
public interface IUserDetailMapper {

    @Select("select * from t_infomation where user_id = #{userId} ")
    public UserDetail findUserDetailByUserId(@Param("userId") Long userId);

    @Delete("delete from t_infomation where id = #{id} ")
    public Long delUserDetailByUserId(@Param("id") Long id);

    @Insert("insert into t_infomation(id,age,address,user_id,sex) " +
            "values(#{userDetail.id} ,#{userDetail.age} ,#{userDetail.address} ,#{userDetail.userId} ,#{userDetail.sex} )")
    public Long addUserDetail(@Param("userDetail") UserDetail userDetail);


}
