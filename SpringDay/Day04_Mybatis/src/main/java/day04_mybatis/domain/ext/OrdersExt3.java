package day04_mybatis.domain.ext;

import day04_mybatis.domain.Orderdetail;
import day04_mybatis.domain.Orders;
import day04_mybatis.domain.User;
import lombok.Data;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class OrdersExt3 extends Orders{

    private String username;

    private String address;

    private User user;

    private List<Orderdetail> orderdetails;
}
