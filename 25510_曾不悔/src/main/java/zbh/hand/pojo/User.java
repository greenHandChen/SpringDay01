package zbh.hand.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author: wuhui
 * @time: 2019/7/18 9:23
 * @desc:
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

}
