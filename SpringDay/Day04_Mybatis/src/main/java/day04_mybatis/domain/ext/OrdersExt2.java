package day04_mybatis.domain.ext;

import day04_mybatis.domain.Orderdetail;
import day04_mybatis.domain.Orders;
import day04_mybatis.domain.User;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class OrdersExt2 {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
    private List<Orderdetail> orderdetails;
}
