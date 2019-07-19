package day04_mybatis.domain.ext;

import day04_mybatis.domain.Orders;
import lombok.Data;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class OrdersExt extends Orders {

    private String username;

    private String address;
}
