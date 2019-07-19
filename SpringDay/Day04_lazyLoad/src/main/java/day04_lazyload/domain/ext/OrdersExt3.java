package day04_lazyload.domain.ext;


import day04_lazyload.domain.Orderdetail;
import day04_lazyload.domain.Orders;
import day04_lazyload.domain.User;
import lombok.Data;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class OrdersExt3 extends Orders {

    private User user;

    private List<Orderdetail> orderdetails;

    @Override
    public String toString() {
        return "OrdersExt3{" +
                "orders= " + super.toString() +
                "user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }
}
