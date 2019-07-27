/**
 * Created by Hsl
 * 2019/7/27 11:05
 */
package com.hand.consumer.ClientService;

import org.springframework.stereotype.Component;

@Component
public class OrderClientFallback implements OrderClientService {


    @Override
    public String findOrderByUserId(Integer id) {
        return "ERROR:服务器内部错误请稍后再试";
    }
}
