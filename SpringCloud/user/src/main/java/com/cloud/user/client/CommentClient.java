package com.cloud.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "comment")
public interface CommentClient {

    @GetMapping("/findComment")
    String findById(@RequestParam("id") Integer id);
}
