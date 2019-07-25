package com.hand.entity.exts;

import com.hand.entity.Items;
import com.hand.entity.OrderDetail;
import com.hand.entity.Orders;

import java.math.BigDecimal;
import java.util.Date;

public class QueryOrder {
    private Items items;
    private Orders orders;
    private OrderDetail detail;
    private Date createtimeStart;
    private Date createtimeEnd;
    private BigDecimal priceStart;
    private BigDecimal priceEnd;

    public QueryOrder() {
        this.orders = new Orders();
        this.detail = new OrderDetail();
        this.items = new Items();
    }

    public QueryOrder(Items items, Orders orders, OrderDetail detail, Date createtimeStart, Date createtimeEnd, BigDecimal priceStart, BigDecimal priceEnd) {
        this.items = items;
        this.orders = orders;
        this.detail = detail;
        this.createtimeStart = createtimeStart;
        this.createtimeEnd = createtimeEnd;
        this.priceStart = priceStart;
        this.priceEnd = priceEnd;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderDetail getDetail() {
        return detail;
    }

    public void setDetail(OrderDetail detail) {
        this.detail = detail;
    }

    public Date getCreatetimeStart() {
        return createtimeStart;
    }

    public void setCreatetimeStart(Date createtimeStart) {
        this.createtimeStart = createtimeStart;
    }

    public Date getCreatetimeEnd() {
        return createtimeEnd;
    }

    public void setCreatetimeEnd(Date createtimeEnd) {
        this.createtimeEnd = createtimeEnd;
    }

    public BigDecimal getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(BigDecimal priceStart) {
        this.priceStart = priceStart;
    }

    public BigDecimal getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(BigDecimal priceEnd) {
        this.priceEnd = priceEnd;
    }

    @Override
    public String toString() {
        return "QueryOrder{" +
                "items=" + items +
                ", orders=" + orders +
                ", detail=" + detail +
                ", createtimeStart=" + createtimeStart +
                ", createtimeEnd=" + createtimeEnd +
                ", priceStart=" + priceStart +
                ", priceEnd=" + priceEnd +
                '}';
    }
}
