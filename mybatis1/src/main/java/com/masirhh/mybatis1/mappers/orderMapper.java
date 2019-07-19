package com.masirhh.mybatis1.mappers;

import com.masirhh.mybatis1.beans.orderExtByMap;
import com.masirhh.mybatis1.beans.orderExtByType;
import com.masirhh.mybatis1.beans.orderExtDdd;

import java.util.List;

public interface orderMapper {
    List<orderExtByType> findOrdersExtByType();
    List<orderExtByMap> findOrdersExtByMap();
    List<orderExtDdd> findDetailsDDD();

}
