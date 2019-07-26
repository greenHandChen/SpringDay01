package com.message.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
@Controller
@RequestMapping("/message")
public class MessageController {

    @GetMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        return "Message服务为您提供了服务";
    }

}
