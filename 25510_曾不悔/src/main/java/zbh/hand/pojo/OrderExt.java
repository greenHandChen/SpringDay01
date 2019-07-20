package zbh.hand.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/19 9:39
 * @desc:
 */
@Data
public class OrderExt  extends Orders implements Serializable {
    private String username;
    private String address;
    private User user;
    private String name;//good
    private Date createtimeStart;
    private Date createtimeEnd;
    private double priceStart;
    private double priceEnd;
    private double totalAmount;

    
    //private List<OrderDetail> orderDetails;
}
