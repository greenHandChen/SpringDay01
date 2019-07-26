package com.springcloud.eurekaconsumerfeign.feign;

import com.springcloud.eurekaconsumerfeign.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@FeignClient("EUREKA-CLIENT")
public interface ClientFeign {

    @GetMapping("/client")
    String say();

    @PostMapping(value = "/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFile(@RequestPart("file") MultipartFile file);

    @GetMapping("/sel/{id}")
    Map<String,Object> select(@PathVariable("id") Integer id);

    @GetMapping("/del/{id}")
    String delete(@PathVariable("id") Integer id);

    @PostMapping(value = "/upd")
    String update(@RequestBody User user);

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    String add(@RequestBody User user);

}
