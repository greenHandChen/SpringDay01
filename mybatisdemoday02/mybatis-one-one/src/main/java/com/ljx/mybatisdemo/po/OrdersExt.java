package com.ljx.mybatisdemo.po;

/**
 *功能描述   扩展类
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 9:40
 */
public class OrdersExt extends Orders{

    private String username;// 用户姓名
    private String sex;// 性别

    //用于嵌套
    private User user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
