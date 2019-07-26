package com.ljx.userserver.vo;

import lombok.Data;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 19:11
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //错误信息
    private String msg;

    //具体内容
    private T data;
}
