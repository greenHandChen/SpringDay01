package com.hand.a_damain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by HuangHeng on 2019/7/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements RowMapper<User> {
    private Long id;
    private String username;
    private String password;

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
       User user=new User();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        return user;
    }
}
