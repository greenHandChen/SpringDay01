package Domin;

import java.util.Date;
import java.util.logging.SimpleFormatter;

public class OrdersExt {

    private  String number;

    private String name;

    private Date createtimeStart;

    private Date createtimeEnd;

    private Float priceStart;

    private Float priceEnd;

    private  User user;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Float getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Float priceStart) {
        this.priceStart = priceStart;
    }

    public Float getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Float priceEnd) {
        this.priceEnd = priceEnd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    private Orders orders;

    private Items items;
    
    @Override
    public String toString() {
        return "OrdersExt{" +
                "username=" + user.getUsername() +
                "address=" + user.getAddress() +
                ", number=" + orders.getNumber() +
                ", createtime=" + orders.getCreatetime() +
                ", price=" + items.getPrice() +
                '}';
    }
}
