package com.hand.consumer.ClientService;

import com.hand.consumer.pojo.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER-MYBATIS",fallback = OrderClientFallback.class)
public interface OrderClientService {


    @GetMapping("/getOrder/{id}")
    String  findOrderByUserId(Integer id);
}
