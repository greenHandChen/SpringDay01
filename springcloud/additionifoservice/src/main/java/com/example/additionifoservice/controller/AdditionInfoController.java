package com.example.additionifoservice.controller;

import com.example.additionifoservice.Domin.AdditionInfo;
import com.example.additionifoservice.dao.AdditionInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addtioninfo")
public class AdditionInfoController {
    @Autowired
    AdditionInfoDao additionInfoDao;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public AdditionInfo getAddtionInfo(@PathVariable Integer id){
        return additionInfoDao.getOne(id);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delAddtionInfo(@PathVariable Integer id){
        try {
            additionInfoDao.delete(id);
            return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }
    @RequestMapping(method = RequestMethod.PUT)
    public AdditionInfo addAddtionInfo(@RequestBody AdditionInfo additionInfo){
        return additionInfoDao.save(additionInfo);
    }
    @RequestMapping(method = RequestMethod.POST)
    public AdditionInfo getAddtionInfo(@RequestBody AdditionInfo additionInfo){
        return additionInfoDao.save(additionInfo);
    }

}
