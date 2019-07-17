package club.osai.jdbc;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: User.java
 * Version: 1.0
 * Date: 2019/7/17
 * Description:
 */

public class User {
    private Long id;
    private String username;
    private String password;

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
}
