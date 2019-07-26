package com.course_server.mapper;



import com.course_server.entity.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CourseMapper {
    @Select("Select * from course")
    List<Course> getAll();
    @Select("select * from course where id=#{id}")
    Course getOne(int id);
    @Insert("insert into course(cname,tname) values(#{cname},#{tname})")
    void add( Course course);
    @Update("update course set cname=#{cname},tname=#{tname} where id=#{id}")
    void update(Course course);
    @Delete("delete from course where id=#{id}")
    void delete(int id);
}
