package com.example.eurekafeign.mapper;

import com.example.eurekafeign.bean.Orders;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.CacheNamespace;

import java.util.List;
public interface AddInformationMapper {
    List<Orders> findUserOtherInfo(Orders orders);

    Integer insertOtherInfo(Orders orders);

    Integer deleteOtherInfo(Orders orders);

    Integer updateOtherInfo(Orders orders);
}
