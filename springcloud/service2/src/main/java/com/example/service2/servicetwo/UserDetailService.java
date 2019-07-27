package com.example.service2.servicetwo;

import com.example.service2.dto.UserDetail;

import java.util.List;

public interface UserDetailService {

    UserDetail findById(Long id);

    List<UserDetail> findAll();

    void delete(Long id);

    void add(UserDetail userDetail);

    void update(UserDetail userDetail);
}
