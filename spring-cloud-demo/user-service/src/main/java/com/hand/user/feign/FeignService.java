package com.hand.user.feign;

import com.hand.user.entity.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "area-service",fallback =FeignServiceImpl.class)
public interface FeignService {
    @GetMapping("/area/select/{id}")
    Country select(@PathVariable("id")Integer id);
    @PostMapping("/area/insert")
    String insert(@RequestBody Country country);

}
