package com.dragon.springcloud.service;

import com.dragon.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @package com.ll.springcloud.service
 * @Author LL
 * @ClassName UserClientService
 * @Date 2019/7/26  16:37
 */
@FeignClient(value = "microservicecloud-user")
public interface UserClientService {

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    User getById(@PathVariable("id") int id);

    @RequestMapping(value = "/user/getAll",method = RequestMethod.GET)
    List<User> list();

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    void add(@RequestBody User user);

    @RequestMapping(value = "/user/update",method = RequestMethod.PUT)
    void update(@RequestBody User user);

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id);

}
