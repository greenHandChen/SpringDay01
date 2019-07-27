package com.hand.handmanageruser.user.feign;

import com.hand.handmanageruser.user.entity.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lwy
 * @version V1.0
 * @program: spring-cloud-exercise
 * @Description: TODO
 * @date 2019/7/27 9:07
 */

@FeignClient("hand-user-detail")
public interface UserDetailFeignClient {

    @GetMapping("/find/{userId}")
    public UserDetail findUserDetailByUserId(@PathVariable("userId") Long userId);
}
