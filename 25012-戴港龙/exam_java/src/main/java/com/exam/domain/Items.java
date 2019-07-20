package com.exam.domain;

import java.util.Date;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 8:53 2019/7/19
 * @Modified By:
 */
public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String detail;
    private String pic;
    private Date createtime;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
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

}
