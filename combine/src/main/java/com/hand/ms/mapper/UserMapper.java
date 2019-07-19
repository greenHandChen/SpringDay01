package com.hand.ms.mapper;

import com.hand.ms.po.User;
import org.springframework.context.annotation.Bean;


import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 11:47
 * @Version 1.0
 */

public interface UserMapper {
    public User findUserById(int id);

}
