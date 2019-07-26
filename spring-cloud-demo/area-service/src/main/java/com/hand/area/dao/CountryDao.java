package com.hand.area.dao;

import com.hand.area.entity.Country;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryDao {
     Country selectById(Country country);
}
