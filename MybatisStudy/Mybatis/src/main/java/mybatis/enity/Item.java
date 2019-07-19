package mybatis.enity;

import lombok.Data;

import javax.swing.*;
import java.util.Date;

/**
 * @Description: 商品POJO模型
 * @Author: TanLinQuan
 * @Date: 2019/7/19 10:56
 * @Version: V1.0
 **/
@Data
public class Item {

    private Integer id;

    private String name;

    private Float price;

    private String detail;

    private Date createTime;
}
