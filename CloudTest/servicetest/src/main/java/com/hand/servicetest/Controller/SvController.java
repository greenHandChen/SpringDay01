package com.hand.servicetest.Controller;

import com.hand.servicetest.Entity.Dept;
import com.hand.servicetest.Entity.UDs;
import com.hand.servicetest.Entity.User;
import com.hand.servicetest.Mapper.SvMapper;
import com.hand.servicetest.Mapper.UserMapper;
import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/feign")
public class SvController {
    private SvMapper svMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    public SvController(SvMapper svMapper) {
        this.svMapper = svMapper;
    }

    private static List<User> UDs_LIST;

    @RequestMapping("/findAll")
    public List<User> findUDsAll(){
        List<User> userAll = svMapper.findUserAll();
        UDs_LIST=Collections.unmodifiableList(userAll);
        userAll.forEach(user ->{
            Dept dept=userMapper.findDeftById(user.getId());
            user.setDeptId(dept.getDeptId());
            user.setDeptName(dept.getDeptName());
        });
        return userAll;
    }

    //根据条件查询信息
    @RequestMapping("/findById/{id}")
    public List<User> findUDsById(@PathVariable("id") Integer id){
        User userById = svMapper.findUserById(id);
        List<User> findById=new ArrayList<>(UDs_LIST);
        findById.add(userById);
        UDs_LIST=Collections.unmodifiableList(findById);
        findById.forEach(user ->{
            Dept dept=userMapper.findDeftById(user.getId());
            user.setDeptId(dept.getDeptId());
            user.setDeptName(dept.getDeptName());
        });
        return findById;
    }
    //根据id删除用户数据
    @RequestMapping("/deleteById/{id}")
    public String deleteUDsById(@PathVariable("id") Integer id){
        String s = svMapper.deleteUserById(id);
        Integer integer = userMapper.deleteUDsById(id);
        if(s!=null&&integer!=null){
            return "delete OK";
        }else{
            return "delte false";
        }
    }
    //新增一个用户
    @RequestMapping("/addUser")
    public String addUser(){
        String s = svMapper.addUser();
        if(s!=null){
            return "add OK";
        }else {
            return "add false";
        }
    }
    //修改用户
    @RequestMapping("/updateUser/{id}")
    public String updateUser(Integer id){
        svMapper.updateUserById(id);
        Dept dept=new Dept();
        dept.setUserId(id);
        dept.setDeptId(11);
        dept.setDeptName("aaa");
        userMapper.updateById(dept);
       return "OK";
    }
}
