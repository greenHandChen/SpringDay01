package haunglehao.study.ms.po;

import java.util.Date;
import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 9:22 2019/7/19
 */
public class OrdersExt extends Orders {

    private Float priceStart;

    private Float priceEnd;

    private Date createtimeStart;

    private Date createtimeEnd;

    private int total_amount;

    private User user;

    private List<Orderdetail> orderdetail;

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

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

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
    
}

