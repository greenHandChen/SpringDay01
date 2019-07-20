package com.wzh.domain;

public class OrderExt extends Orders {
    private String username;
    private String address;
    private double totalAmount;

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

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", totalAmount=" + totalAmount +
                ", detailList=" + detailList +
                '}';
    }
}
