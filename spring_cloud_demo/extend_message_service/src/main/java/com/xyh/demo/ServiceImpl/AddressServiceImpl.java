package com.xyh.demo.ServiceImpl;

import com.thoughtworks.xstream.io.AbstractDriver;
import com.xyh.demo.Entity.Address;
import com.xyh.demo.Mapper.AddressMapper;
import com.xyh.demo.Service.AddressService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addressServiceImpl")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> findAll() {
        return addressMapper.findAll();
    }

    @Override
    public Address findById(Integer id) {
        return addressMapper.findById(id);
    }

    @Override
    public Address findByUserId(Integer userId) {
        return addressMapper.findByUserId(userId);
    }

    @Override
    public Address create(Address address) {
        addressMapper.create(address);
        return address;
    }

    @Override
    public Address update(Address address) {
        addressMapper.update(address);
        return address;
    }

    @Override
    public void delete(Integer id) {
        addressMapper.delete(id);
    }
}
