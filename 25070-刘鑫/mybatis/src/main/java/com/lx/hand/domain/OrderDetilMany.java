package com.lx.hand.domain;

public class OrderDetilMany extends OrderDetail{
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
