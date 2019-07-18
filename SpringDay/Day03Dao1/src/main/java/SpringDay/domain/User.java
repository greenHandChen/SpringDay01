package SpringDay.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/18.
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

}
