package com.jmx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {
      @Autowired
      private JdbcTemplate jdbcTemplate;
      public void testApi(){
        /* HikariDataSource ds=new  HikariDataSource();
          System.out.println(ds);
          ds.setDriverClassName("com.mysql.jdbc.Driver");
          ds.setJdbcUrl("jdbc:mysql://localhost:3306/jmxspringtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
          ds.setUsername("root");
          ds.setPassword("3130421134");

         JdbcTemplate jt=new JdbcTemplate(ds);*/
         System.out.println(jdbcTemplate);
          String insert_sql="insert into sys_user(username,password) value(?,?)";
          jdbcTemplate.update(insert_sql,"jmx","123456");


      }
      public static  void main(String args[]){
          ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
          TestJDBC testJDBC=(TestJDBC)ctx.getBean("testJDBC");
          testJDBC.testApi();


      }
}
