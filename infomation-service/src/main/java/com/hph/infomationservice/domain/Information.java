package com.hph.infomationservice.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "information")
public class Information {

    private Integer id;

    private Integer userId;

    private String information;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
