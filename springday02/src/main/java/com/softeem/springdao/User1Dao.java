package com.softeem.springdao;

import com.softeem.spring.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class User1Dao {
     @Autowired
    private JdbcTemplate jdbcTemplate;

    public User1 getUser1ByUid(int uid){

        String sql = "select * from User1 where uid=?";
      //  Object[] objects = {user1.getUid()};



        //return jdbcTemplate.queryForObject(sql,new User1(),objects);
        return jdbcTemplate.queryForObject(sql, new RowMapper<User1>() {
            @Override
            public User1 mapRow(ResultSet resultSet, int i) throws SQLException {
                  User1 user1 = new User1();
                user1.setUid(resultSet.getInt("uid"));
                user1.setUsername(resultSet.getString("username"));
                user1.setPassword(resultSet.getString("password"));
                return  user1;
            }
        },uid);

    }

    public List<User1> getListUser(){
        String sql = "select * from user1";
//        return  jdbcTemplate.query(sql, new RowMapper<User1>() {
//            @Override
//            public List<User1>  mapRow(ResultSet resultSet, int i) throws SQLException {
//               List<User1> list = new ArrayList<>();
//
//                User1 user1 = new User1();
//                user1.setUid(resultSet.getInt("uid"));
//               user1.setUsername(resultSet.getString("username"));
//               user1.setPassword(resultSet.getString("password"));
//               list.add(user1);
//                return list;
//           }
//       });

        //return jdbcTemplate.query(sql,new RowMapperResultReader(new UserRowMapper))
        return null;
    }

}
