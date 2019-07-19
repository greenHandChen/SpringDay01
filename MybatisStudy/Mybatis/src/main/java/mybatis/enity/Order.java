package mybatis.enity;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @Description: 订单POJO模型
 * @Author: TanLinQuan
 * @Date: 2019/7/19 9:00
 * @Version: V1.0
 **/
@Data
public class Order {
//  订单ID
    private Integer id;
//  订单用户ID
    private Integer userId;
//  订单备注
    private String note;
//  订单数量
    private String number;
//  订单创建时间
    private Date createtime;
//  UserPOJO
    private User user;
//  OrderDtail List
    private List<OrderDetail> orderDetailList;

}
