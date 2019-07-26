package com.hph.userservice.dao;

import com.hph.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {



}
