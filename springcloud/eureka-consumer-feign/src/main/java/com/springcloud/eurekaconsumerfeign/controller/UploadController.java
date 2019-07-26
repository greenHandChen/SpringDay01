package com.springcloud.eurekaconsumerfeign.controller;

import com.springcloud.eurekaconsumerfeign.feign.ClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @Autowired
    private ClientFeign clientFeign;

    @PostMapping(value = "/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart("file")MultipartFile file){
        String s = clientFeign.uploadFile(file);
        return s;
    }

}
