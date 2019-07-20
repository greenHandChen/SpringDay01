package com.hand.vo;

import com.hand.domain.User;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class OrdersExt {
    private String number;
    private User user;
    private String name;
    private Timestamp createtime;
    private List<OrdersItemVo> ordersItems;
    private BigDecimal total_amount;
    private String createtimeStart;
    private String createtimeEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrdersItemVo> getOrdersItems() {
        return ordersItems;
    }

    public void setOrdersItems(List<OrdersItemVo> ordersItems) {
        this.ordersItems = ordersItems;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public String getCreatetimeStart() {
        return createtimeStart;
    }

    public void setCreatetimeStart(String createtimeStart) {
        this.createtimeStart = createtimeStart;
    }

    public String getCreatetimeEnd() {
        return createtimeEnd;
    }

    public void setCreatetimeEnd(String createtimeEnd) {
        this.createtimeEnd = createtimeEnd;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "number='" + number + '\'' +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", ordersItems=" + ordersItems +
                ", total_amount=" + total_amount +
                ", createtimeStart='" + createtimeStart + '\'' +
                ", createtimeEnd='" + createtimeEnd + '\'' +
                '}';
    }
}
