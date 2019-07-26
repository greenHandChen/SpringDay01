package com.lx.eurekaclient.service;

import com.lx.eurekaclient.domain.User;

public interface IUserService {
    User findUserById(Integer id);
}
