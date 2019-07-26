package com.example.eurekafeign.controller;

import com.example.eurekafeign.bean.Orders;
import com.example.eurekafeign.mapper.AddInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddInformationController {

    @Autowired
    private AddInformationMapper addInformationMapper;

    @PostMapping("/queryother")
    public List<Orders> findUserOtherInfo(@RequestBody Orders orders){

        return addInformationMapper.findUserOtherInfo(orders);
    }

    @PostMapping("/insertotherinfo")
    public boolean insertOtherInfo(Orders orders){
        return addInformationMapper.insertOtherInfo(orders)>0;
    }

    @PostMapping("/deleteotherinfo")
    public boolean deleteOtherInfo(Orders orders){
        return addInformationMapper.deleteOtherInfo(orders)>0;
    }

    @PostMapping("/updateotherinfo")
    public boolean updateOtherInfo(Orders orders){
        return addInformationMapper.updateOtherInfo(orders)>0;
    }


}
