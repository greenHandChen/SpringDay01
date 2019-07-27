package com.example.service.dao;

import com.example.service.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Id;

@Repository
public interface UserDao extends JpaRepository<User, Id> {
    User findById(Long id);

    void deleteById(Long id);

}
