package com.txz.test;

import com.txz.dao.UserDaoImpl;
import com.txz.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDaoTest {
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

    @Test
    public void findUserById(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationConfig.xml");
        UserDaoImpl bean = applicationContext.getBean(UserDaoImpl.class);
        User user = bean.finUserById(30);
        System.out.println(user.toString());

//        String[] s = applicationContext.getBeanDefinitionNames();
//        for(String s1 : s)
//            System.out.println(s1);
    }

}
