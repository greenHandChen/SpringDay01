package springcloudtest.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springcloudtest.entities.User;

import java.util.List;

@FeignClient(value = "EUREKA-CLIENT-USER")
public interface UserService {

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    List<User> listUsers();

    @RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
    User getUserById(int id);
}
