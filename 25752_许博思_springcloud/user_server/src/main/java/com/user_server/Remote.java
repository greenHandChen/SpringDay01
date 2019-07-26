package com.user_server;

import com.user_server.entity.Course;
import com.user_server.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="course-server")
public interface Remote {
    @RequestMapping("/selectAll")
    public List<Course> qureyAll();
    @RequestMapping("/selectOne")
    public Course qureyOen();
    @RequestMapping("/add")
    public void add();
    @RequestMapping("/update")
    public void update();
    @RequestMapping("/delete")
    public void delete();
}
