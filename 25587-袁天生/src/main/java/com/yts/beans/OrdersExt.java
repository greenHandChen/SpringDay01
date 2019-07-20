package com.yts.beans;

public class OrdersExt extends Orders {

    private String username;
    private String address;

    private float priceStart;

    private float priceEnd;

    public float getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(float priceStart) {
        this.priceStart = priceStart;
    }

    public float getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(float priceEnd) {
        this.priceEnd = priceEnd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + super.getId() +
                ", number='" + super.getNumber() + '\'' +
                ", createtime=" + super.getCreatetime() +
                ", note='" + super.getNote() + '\'' +
                '}'+"OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
