package com.jmx.Dao;
/**
 * Created by minxi.jiang on 2019/7/18
 */

public interface IAccountDao {
    /**
     * @Author:minxi.jiang
     * @Decription 根据用户账号转出
     * @Date 2019/7/18
     */
    void out(String outer,Double money);
    /**
    * @Author:minxi.jiang
     * @Decription 根据用户账号转进
     * @Date 2019/7/18
    */
    void in(String inter,Double money);

}
