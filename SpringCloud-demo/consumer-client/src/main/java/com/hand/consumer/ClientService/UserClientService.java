/**
 * Created by Hsl
 * 2019/7/26 18:43
 */
package com.hand.consumer.ClientService;

import com.hand.consumer.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "PROVIDER-MYBATIS",fallback = UserClientFallback.class)
public interface UserClientService {

    @GetMapping("/user/{id}")
    String  findUserById(@PathVariable("id") Integer id);

    @PostMapping("/user/add")
    String  addUser(User user);

}
