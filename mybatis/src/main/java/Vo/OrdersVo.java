package Vo;

import Domin.OrderDetail;
import Domin.Orders;
import Domin.User;

import java.util.List;

public class OrdersVo extends Orders {

    private String username;

    private String address;

    private List<OrderDetail> orderDetails;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

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
}
