package com.me;

public class User {
    private String name;
    private String password;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public User() {
    }
}
