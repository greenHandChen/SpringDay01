package huanglehao.study.Entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserObject implements RowMapper<UserObject> {

    private int id;
    private String username;
    private String password;


    @Override
    public UserObject mapRow(ResultSet resultSet, int i) throws SQLException {
        UserObject userObject=new UserObject();
        userObject.setId(resultSet.getInt("id"));
        userObject.setUsername(resultSet.getString("username"));
        userObject.setPassword(resultSet.getString("password"));
        return userObject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "UserObject{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
