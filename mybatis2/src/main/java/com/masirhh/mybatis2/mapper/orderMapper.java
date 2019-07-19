package com.masirhh.mybatis2.mapper;

import com.masirhh.mybatis2.beans.orderExtByMap;
import com.masirhh.mybatis2.beans.orderExtByType;
import com.masirhh.mybatis2.beans.orderExtDdd;

import java.util.List;

public interface orderMapper {
    List<orderExtByType> findOrdersExtByType();
    List<orderExtByMap> findOrdersExtByMap();
    List<orderExtDdd> findDetailsDDD();

}
