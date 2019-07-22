package com.ceh.demo.service;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public interface IAccountService {
    /**
     * @Author: enHui.Chen
     * @Description: 转账方法
     * @Data 2019/7/17
     */
    void transfer(String outer, String inner, BigDecimal money);
}
