package zbh.hand.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: wuhui
 * @time: 2019/7/19 9:20
 * @desc:
 */
@Data
public class OrderDetail implements Serializable {
    private Integer id;
    private Integer orderId;
    private Integer itemsId;
    private Integer itemsNum;
    
}
