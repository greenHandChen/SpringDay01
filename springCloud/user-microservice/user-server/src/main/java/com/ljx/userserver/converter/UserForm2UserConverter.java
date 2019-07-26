package com.ljx.userserver.converter;

import com.ljx.userserver.domain.User;
import com.ljx.userserver.form.UserForm;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 11:44
 */
public class UserForm2UserConverter {
    public static User convert(UserForm userForm){
        User info = new User();
        info.setId(userForm.getId());
        info.setUsername(userForm.getUsername());
        info.setBirthday(userForm.getBirthday());
        info.setAddressId(userForm.getAddressId());
        return  info;
    }
}
