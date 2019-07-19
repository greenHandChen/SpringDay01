package day04_cache.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/18.
 */
@Data
public class User implements Serializable{
    //序列化ID

    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;
}
