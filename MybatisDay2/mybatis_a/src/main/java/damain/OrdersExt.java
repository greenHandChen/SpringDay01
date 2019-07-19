package damain;

import java.util.List;

public class OrdersExt extends  Orders{
    private  String username;
    private  String address;
    private  User user;
    private List<Orderdetail> orderdetails;

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

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    @Override
    public String toString() {
        super.toString();
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", orderdetails=" +
                '}'+ orderdetails +this.getCreatetime()+this.getCreatetime()+this.getNote();
    }
}
