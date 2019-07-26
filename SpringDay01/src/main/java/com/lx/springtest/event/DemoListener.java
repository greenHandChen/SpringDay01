package com.lx.springtest.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 事件监听器
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("我（bean-demoListener）接收到了发布的信息："+msg);
    }
}
