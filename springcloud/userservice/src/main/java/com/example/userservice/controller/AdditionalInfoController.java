package com.example.userservice.controller;

import com.example.userservice.domain.AdditionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addtioninfo")
public class AdditionalInfoController {

    @Autowired
    AdditionalInfoClient additionalInfoClient;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String getAddtinoInfo(@PathVariable Integer id){
        return  additionalInfoClient.getAdditionInfo(id) ;
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delAddtinoInfo(@PathVariable Integer id){
        return  additionalInfoClient.del(id) ;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public String addAddtinoInfo(@RequestBody AdditionInfo additionInfo){
        return  additionalInfoClient.add(additionInfo) ;
    }
    @RequestMapping(method = RequestMethod.POST)
    public String updateAddtinoInfo(@RequestBody AdditionInfo additionInfo){
        return  additionalInfoClient.update(additionInfo) ;
    }


}
