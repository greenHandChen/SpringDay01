package com.example.additionifoservice.dao;

import com.example.additionifoservice.Domin.AdditionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionInfoDao  extends JpaRepository<AdditionInfo,Integer> {
}
