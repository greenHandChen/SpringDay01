package com.ssm.model;

import java.sql.Date;

/**
 * Created by minxi.jiang on 2019/7/19
 * @Decription:商品信息的POJO类
 * */
public class Item {
    /*id	int(11)	NO	PRI		auto_increment
    name	varchar(32)	NO
    price	float(10,1)	NO
    detail	text	YES
    pic	varchar(64)	YES
    createtime	datetime	NO*/
    private Integer id;
    private String name;
    private Double price;
    private String detail;
    private String pic;

    public int getId() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    private Date createtime;
}
