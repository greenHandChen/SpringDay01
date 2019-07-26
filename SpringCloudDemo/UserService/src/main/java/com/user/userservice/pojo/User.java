package com.user.userservice.pojo;

/**
 * @description: user实体类
 * @author: xueWu.Chen
 * @create: 2019-07-26
 **/

public class User {
    private int id;
    private String name;
    private String age;
    private String sex;
    private String address;
    private int is_del;

    public int getIs_del() {
        return is_del;
    }

    public void setIs_del(int is_del) {
        this.is_del = is_del;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "name:"+name+" sex:"+sex+" age:"+age+
                " address:"+address;
    }
}
