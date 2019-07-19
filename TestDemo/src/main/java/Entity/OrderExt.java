package Entity;

import java.util.List;

public class OrderExt extends Order {

    // （1）. 一对一映射：使用resultType
    // 关联订单：用户账号
    // 关联订单：用户地址
    private String username;

    private String address;

    // （2）. 一对一映射：使用resultMap
    private User user;

    // 一对多映射
    private List<OrderDetail> orderDetailList;

    // Getter & Setter
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
}
