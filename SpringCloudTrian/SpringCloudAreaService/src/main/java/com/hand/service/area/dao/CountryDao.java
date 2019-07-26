package com.hand.service.area.dao;

import com.hand.service.area.pojo.Country;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 16:25
 **/
@Mapper
@Repository
public interface CountryDao {
    List<Country> findAll();

    Country findById(Integer id);

    int add(Country country);

    int delete(Integer id);

    int update(Country country);
}
