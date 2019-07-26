package com.zhang.countryprovider.controller;

import com.alibaba.fastjson.JSON;
import com.zhang.countryprovider.pojo.Country;
import com.zhang.countryprovider.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * ClassName:CountryController
 * Author:ZhangChunjia
 * Date:2019/7/26 11:52
 */
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    /**
     * 提供给给 userService端调用   Feign
     * @param id
     * @return
     */
    @RequestMapping(value = "/findCountry")
    public String countryFeign(Integer id){
        Country country=countryService.findCountryById(id);
        return JSON.toJSONString(country);
    }

    @RequestMapping(value = "/showCountry")
    public ModelAndView showCountry(){
        ModelAndView modelAndView=new ModelAndView();
        List<Country> countryList= countryService.showCountry();
        modelAndView.getModel().put("countryList",countryList);
        modelAndView.setViewName("showCountry");
        return modelAndView;
    }

    @RequestMapping(value = "/addCountry")
    public String addCountry(Country country){
        country.setName("日本");
        countryService.addCountry(country);
        return "添加成功";
    }


    @RequestMapping(value = "/deleteCountry")
    public String deleteCountry(Country country){

        country.setId(0);
        countryService.deleteCountry(country);
        return "删除成功";
    }

    @RequestMapping(value = "/updateCountry")
    public String updateCountry(Country country){
        country.setId(4);
        country.setName("印度");
        countryService.updateCountry(country);
        return "更新成功";
    }
}
