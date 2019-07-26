package app.service;

import entity.UserMore;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: wuhui
 * @time: 2019/7/26 18:18
 * @desc:
 */
@FeignClient(name = "user-more8002")
public interface UserMoreService {
    @GetMapping(value = "/userMore/{id}")
    public UserMore selectUserMoreById(@PathVariable("id") Integer id);
}
