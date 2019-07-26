package com.ct.user.mapper;

import com.ct.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@Repository
public interface UserMapper {
    void add(User user);
    Integer delete(Long id);
    List<User> query(User user);
    Integer update(User user);
}
