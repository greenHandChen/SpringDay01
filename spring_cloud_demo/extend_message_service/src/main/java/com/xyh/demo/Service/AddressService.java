package com.xyh.demo.Service;

import com.xyh.demo.Entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> findAll();

    Address findById(Integer id);

    Address findByUserId(Integer userId);

    Address create(Address address);

    Address update(Address address);

    void delete(Integer id);
}
