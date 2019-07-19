package day04_mybatis.domain;

import lombok.Data;

/**
 * Created by wangjie_fourth on 2019/7/19.
 */
@Data
public class Orderdetail {

    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private Integer itemsNum;
}
