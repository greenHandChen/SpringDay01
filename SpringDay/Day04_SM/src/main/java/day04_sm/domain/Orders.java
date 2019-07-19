package day04_sm.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class Orders {

    private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;
}
