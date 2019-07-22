package com.ceh.demo.dao;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public interface IAccountDao {
    /**
     * @Author: enHui.Chen
     * @Description: 转入
     * @Data 2019/7/17
     */
    void in(String inner, BigDecimal money);

    /**
     * @Author: enHui.Chen
     * @Description: 转出
     * @Data 2019/7/17
     */
    void out(String outer, BigDecimal money);
}
