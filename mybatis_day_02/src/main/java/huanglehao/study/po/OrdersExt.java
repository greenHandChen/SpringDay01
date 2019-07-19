package huanglehao.study.po;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 9:22 2019/7/19
 */
public class OrdersExt extends Orders {

    private String username;
    private String sex;

    private User user;

    private List<Orderdetail> orderdetail;

    public List<Orderdetail> getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(List<Orderdetail> orderdetail) {
        this.orderdetail = orderdetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

