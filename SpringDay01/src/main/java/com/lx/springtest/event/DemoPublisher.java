package com.lx.springtest.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

// 发布事件类
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext; // 用来发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
