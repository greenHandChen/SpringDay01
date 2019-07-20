package com.hand.entity;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/20 15:12
 */
public class OrderExt extends  Orders  {

    private User user;

    List<Items> itemsList;



    List<OrderDetail> orderDetailList;



    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "user=" + user +
                ", itemsList=" + itemsList +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
