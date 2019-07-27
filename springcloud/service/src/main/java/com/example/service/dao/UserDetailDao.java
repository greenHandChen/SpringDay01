package com.example.service.dao;

import com.example.service.dto.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service2")
public interface UserDetailDao {
    @RequestMapping("/findOneDetail")
    UserDetail findDetail(@RequestParam Long id);

    @RequestMapping("/findAllDetail")
    UserDetail findALL();

    @RequestMapping("/addDetail")
    String addDetail(@RequestBody UserDetail userDetail);

    @RequestMapping("/updateDetail")
    String updateDetail(@RequestBody UserDetail userDetail);

    @RequestMapping("/deleteDetail")
    String deleteDetail(@RequestParam(value = "id") Long id);
}
