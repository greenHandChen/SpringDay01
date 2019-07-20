package com.mybatis.pojo;

import java.util.Date;

public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String detail;
    private Date createtime;

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
