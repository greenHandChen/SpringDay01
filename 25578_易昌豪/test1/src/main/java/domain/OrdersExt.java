package domain;


import java.util.Date;

public class OrdersExt extends Orders {
    private User user;
    private String name;
    private Double price;
    private Double totalAmount;
    private Date createtimeStart;
    private Date createtimeEnd;
    private Double priceStart;
    private Double priceEnd;

    @Override
    public String toString() {
        return "OrdersExt{" +
                "user=" + user +
                ", number=" +getNumber()+
                ", name=" + name +
                ", price=" + price +
                ", total=" + totalAmount +
                ", createtime=" + getCreatetime() +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
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

    public Double getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Double priceStart) {
        this.priceStart = priceStart;
    }

    public Double getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Double priceEnd) {
        this.priceEnd = priceEnd;
    }
}
