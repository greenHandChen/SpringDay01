package com.hand.servicetest.Mapper;

import com.hand.servicetest.Entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@FeignClient(value = "provider")
public interface SvMapper {
    @RequestMapping("user/findAll")
    public List<User> findUserAll();
    //根据条件查询信息
    @RequestMapping("user/findUserById/{id}")
    public User findUserById(@PathVariable("id") Integer id);
    //增加用户
    @RequestMapping(value = "user/addUser",method = RequestMethod.GET)
    public String addUser();
    //根据id修改用户信息
    @RequestMapping(value = "user/updateUserById/{id}",method = RequestMethod.GET)
    public String updateUserById(@PathVariable("id") Integer id);
    //根据id删除用户数据
    @RequestMapping(value = "user/deleteUserById/{id}",method = RequestMethod.GET)
    public String deleteUserById(@PathVariable("id") Integer id);
}
