package club.osai.other.po;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: ResponseStatus.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
@Builder
@Data
@ToString
public class ResponseStatus {

    private String msg;
    private Integer status;
    private Object object;
}
