package com.zhang.userprovider.pojo;

/**
 * ClassName:Country
 * Author:ZhangChunjia
 * Date:2019/7/26 11:33
 */
public class Country {
    private Integer id;
    private String countryname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return countryname;
    }

    public void setName(String name) {
        this.countryname = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + countryname + '\'' +
                '}';
    }
}
