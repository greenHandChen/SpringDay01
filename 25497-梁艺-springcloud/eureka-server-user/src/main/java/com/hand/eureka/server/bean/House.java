package com.hand.eureka.server.bean;

import org.springframework.stereotype.Component;

/**
 * 房子
 * @author Fandelu
 */
@Component
public class House {

    private Integer id;
    private Integer uid;
    private String housename;
    private String address;

    public House() {
    }

    public House(Integer uid, String housename, String address) {
        this.uid = uid;
        this.housename = housename;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", uid=" + uid +
                ", housename='" + housename + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
