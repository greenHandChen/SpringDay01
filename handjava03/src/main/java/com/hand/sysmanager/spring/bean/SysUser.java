package com.hand.sysmanager.spring.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 9:16
 */
public class SysUser  implements RowMapper<SysUser> {
    private Long id;
    private String username;
    private String password;

    @Override
    public String toString()   {
        return "SysUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SysUser mapRow(ResultSet rs, int rowNum) throws SQLException {
        SysUser user = new SysUser();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        return user;
    }
}
