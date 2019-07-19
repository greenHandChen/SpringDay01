package day04_sm.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class Items {

    private Integer id;

    private String name;

    private BigDecimal price;

    private String detail;

    private String pic;

    private Date createtime;
}
