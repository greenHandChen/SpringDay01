package com.hand.entity;

/**
 * ClassName:Goods
 * Author:ZhangChunjia
 * Date:2019/7/19 9:47
 */
public class Goods {
    private Integer good_id;
    private String good_name;

    public Integer getGood_id() {
        return good_id;
    }

    public void setGood_id(Integer good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "good_id=" + good_id +
                ", good_name='" + good_name + '\'' +
                '}';
    }
}
