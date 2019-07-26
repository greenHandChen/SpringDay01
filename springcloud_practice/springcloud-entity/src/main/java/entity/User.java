package entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author: wuhui
 * @time: 2019/7/26 11:25
 * @desc:
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

}
