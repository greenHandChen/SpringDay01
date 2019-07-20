package zbh.hand.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/19 9:16
 * @desc:
 */
@Data
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;

    


}
