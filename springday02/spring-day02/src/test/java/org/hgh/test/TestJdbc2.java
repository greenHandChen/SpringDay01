package org.hgh.test;

import org.hgh.demo.pojo.User;
import org.hgh.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//这两个注释都得加上
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJdbc2 {
    @Autowired
    IUserService iUserService;
    @Test
    public void test(){
        User user = new User(1L,"赵六","656565");
        iUserService.UpdateUser(user);

    }

    @Test
    public void test1(){
        String name = iUserService.getUsername(1L);
        Integer count = iUserService.getCount();
        System.out.println("This id name is :" + name +"\n"+ "Total ："+ count);
    }

    @Test
    public void test2(){
        System.out.println(iUserService.getUsers());
    }

}
