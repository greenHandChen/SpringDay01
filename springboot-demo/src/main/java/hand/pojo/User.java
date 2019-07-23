package hand.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/18 16:34
 * @Description: User
 */
@Data
@Table(name = "user")
public class User implements Serializable {
    @Id
    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;
}
