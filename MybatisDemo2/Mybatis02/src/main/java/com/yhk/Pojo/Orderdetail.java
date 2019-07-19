package com.yhk.Pojo;

public class Orderdetail {
    private Integer id;
    private Integer order_id;
    private Integer items_id;
    private Integer items_num;
    //商品信息
    private  Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getItems_id() {
        return items_id;
    }

    public void setItems_id(Integer items_id) {
        this.items_id = items_id;
    }

    public Integer getItems_num() {
        return items_num;
    }

    public void setItems_num(Integer items_num) {
        this.items_num = items_num;
    }

    @Override
    public String toString() {
        return "订单信息{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", items_id=" + items_id +
                ", items_num=" + items_num +"\n"+
                ", items=" + items +
                '}';
    }
}
