package com.example.service2.dto;

import javax.persistence.*;

@Table(name = "user_detail")
@Entity
public class UserDetail {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,unique = true)
    private Long userId;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
