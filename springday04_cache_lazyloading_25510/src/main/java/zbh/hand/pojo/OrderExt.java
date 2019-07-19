package zbh.hand.pojo;

import lombok.Data;

import java.io.Serializable;
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
    private List<OrderDetail> orderDetails;
}
