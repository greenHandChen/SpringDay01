package com.course_server.Controller;

import com.course_server.entity.Course;
import com.course_server.mapper.CourseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private CourseMapper courseMapper;
    @RequestMapping("/selectAll")
    public List<Course> qureyAll()
    {
        List<Course> list= courseMapper.getAll();
        return  list;
    }
    @RequestMapping("/selectOne")
    public Course qureyOen()
    {
        Course course=courseMapper.getOne(1);
        return course;
    }
    @RequestMapping("/add")
    public void add()
    {
        Course course=new Course();
        course.setCname("C");
        course.setTname("CEH");
        courseMapper.add(course);

    }
    @RequestMapping("/update")
    public void update()
    {
        Course course=new Course();
        course.setCname("SQL");
        course.setTname("YK");
        course.setId(2);
        courseMapper.update(course);
    }
    @RequestMapping("/delete")
    public void delete()
    {
        courseMapper.delete(2);
    }


}
