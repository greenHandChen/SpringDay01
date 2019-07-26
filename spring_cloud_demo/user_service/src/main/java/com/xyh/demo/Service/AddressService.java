package com.xyh.demo.Service;

import com.xyh.demo.Entity.Address;
import com.xyh.demo.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@FeignClient("extend-message-service")
@RequestMapping("/address")
public interface AddressService {

    @GetMapping
    List<Address> findAll();

    @GetMapping("/{userId}")
    Address findByUserId(@PathVariable Integer userId);

    @PostMapping
    Address create(@RequestBody Address address);

    @PutMapping
    Address update(@RequestBody Address address);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id);

}
