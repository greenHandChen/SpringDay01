package com.ll.mybatis.po;

import java.util.Date;

public class Items {

    private Integer id;

    private String name;

    private Float price;

    private String pic;

    private Date date;

    public Items(Integer id, String name, Float price, String pic, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.date = date;
    }

    public Items() {
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
