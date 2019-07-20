package zbh.hand.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * @author: wuhui
 * @time: 2019/7/19 9:22
 * @desc:
 */
@Data
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String detail;
    private String pic;
    private Date createtime;
    
}
