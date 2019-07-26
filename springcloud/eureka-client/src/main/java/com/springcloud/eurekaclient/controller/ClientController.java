package com.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ClientController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/client")
    public String say(){
        return "eureka-server have " + discoveryClient.getServices();
    }

    /**
     * Feign文件上传测试
     * @param file
     * @return
     */
    @PostMapping(value = "/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart("file")MultipartFile file){
        return file.getOriginalFilename();
    }

}
