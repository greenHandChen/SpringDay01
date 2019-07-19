package mybatis.enity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description:用户对象POJO类
 * @Author: TanLinQuan
 * @Date: 2019/7/18 11:42
 * @Version: V1.0
 **/
@Data
public class User implements Serializable {

//    用户ID
    private Integer id;
//    用户姓名
    private String username;
//    用户生日
    private Date birthday;
//    用户性别
    private Character sex;
//    用户地址
    private String address;

//    用户订单
    private List<Order> orderList;


}
