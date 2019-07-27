package model;

import java.io.Serializable;

/**
 * @Author: jmx
 * @Date:created in 2019/7/22
 * @Description: 用户的POJO类，描述用户信息
 */
public class UserDemo implements Serializable {
    private Long userId;
    private String userName;
    private String  userSex;
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
