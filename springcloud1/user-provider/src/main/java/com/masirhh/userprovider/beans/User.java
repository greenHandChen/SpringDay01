package com.masirhh.userprovider.beans;


import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String username;
    private Integer countryid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", countryid=" + countryid +
                '}';
    }
}
