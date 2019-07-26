package com.hph.infomationservice.dao;

import com.hph.infomationservice.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface informationDao extends JpaRepository<Information, Integer> {
}
