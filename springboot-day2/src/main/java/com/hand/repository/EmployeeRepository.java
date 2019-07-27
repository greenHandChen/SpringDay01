package com.hand.repository;

import com.hand.entity.HandEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends JpaRepository<HandEmployee,Integer> , JpaSpecificationExecutor<HandEmployee> {

}
