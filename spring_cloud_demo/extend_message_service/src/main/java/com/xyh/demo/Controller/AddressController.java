package com.xyh.demo.Controller;

import com.xyh.demo.Entity.Address;
import com.xyh.demo.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    @Qualifier("addressServiceImpl")
    private AddressService addressService;

    @GetMapping
    public List<Address> findAll(){
        return addressService.findAll();
    }

    @GetMapping("/{userId}")
    public Address findByUserId(@PathVariable Integer userId){
        return addressService.findByUserId(userId);
    }

    @PostMapping
    public Address create(@RequestBody Address address){
        return addressService.create(address);
    }

    @PutMapping
    public Address update(@RequestBody Address address){
        return addressService.update(address);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        addressService.delete(id);
    }
}
