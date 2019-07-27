package com.example.service2.dao;

import com.example.service2.dto.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface UserDetailDao extends JpaRepository<UserDetail, Id> {

    UserDetail findByUserId(Long id);

    void deleteById(Long id);
}
