package com.xyh.demo.Mapper;

import com.xyh.demo.Entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {

    List<Address> findAll();

    Address findById(Integer id);

    Address findByUserId(Integer userId);

    void create(Address address);

    void update(Address address);

    void delete(Integer id);
}
