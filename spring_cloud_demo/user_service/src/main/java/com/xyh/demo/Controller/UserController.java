package com.xyh.demo.Controller;

import com.xyh.demo.Entity.Address;
import com.xyh.demo.Entity.User;
import com.xyh.demo.Service.AddressService;
import com.xyh.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findUserAndAddressById(@PathVariable Integer id) {
        User user = userService.findById(id);
        Address address=null;
        if(user!=null)
            address=addressService.findByUserId(id);
        user.setAddress(address);
        return user;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        userService.create(user);
        user.getAddress().setUserId(user.getId());
        if(user!=null&&user.getAddress()!=null)
            user.setAddress(addressService.create(user.getAddress()));
        return user;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Integer id, @RequestBody User user) {
        Address address=user.getAddress();
        if (id == null)
            return null;
        if (user.getId() == null || user.getId() != id)
            user.setId(id);
        if(address!=null)
            addressService.update(address);
        userService.update(user);
        user.setAddress(address);
        return user;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
        Integer addressId=addressService.findByUserId(id).getId();
        if(addressId!=null)
            addressService.delete(addressId);
    }

}
