package com.user_server.Controller;

import com.user_server.Remote;
import com.user_server.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class CourseController {
    @Autowired
    Remote remote;
    @RequestMapping("/selectAll")
    public List<Course> qureyAll()
    {
        List<Course> list= remote.qureyAll();
        return  list;
    }
    @RequestMapping("/selectOne")
    public Course qureyOen()
    {
        Course course=remote.qureyOen();
        return course;
    }
    @RequestMapping("/add")
    public void add()
    {
        remote.add();
    }
    @RequestMapping("/update")
    public void update()
    {
      remote.update();
    }
    @RequestMapping("/delete")
    public void delete()
    {
        remote.delete();
    }
}
