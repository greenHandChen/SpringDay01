package day04_mybatis.domain.ext;

import day04_mybatis.domain.Orders;
import day04_mybatis.domain.User;
import lombok.Data;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class OrdersExt2 extends Orders {

    private String username;

    private String address;

    private User user;
}
