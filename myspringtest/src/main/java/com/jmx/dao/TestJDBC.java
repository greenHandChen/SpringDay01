package com.jmx.dao;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {
      public void testApi(){
          HikariDataSource ds=new  HikariDataSource();
          System.out.println(ds);
          ds.setDriverClassName("com.mysql.jdbc.Driver");
          ds.setJdbcUrl("jdbc:mysql://localhost:3306/jmxspringtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
          ds.setUsername("root");
          ds.setPassword("3130421134");

          JdbcTemplate jt=new JdbcTemplate(ds);
          String insert_sql="insert into login value(?,?)";
          jt.update(insert_sql,"jmx","123456");


      }
      public static  void main(String args[]){
          TestJDBC tj=new TestJDBC();
          tj.testApi();


      }
}
