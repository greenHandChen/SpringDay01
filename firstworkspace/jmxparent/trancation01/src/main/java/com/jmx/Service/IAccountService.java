package com.jmx.Service;
/*
* Created by minxi.jiang on 2019/7/18
* */
public interface IAccountService {
    /*
    * @Author:minxi jiang
    * @Decription:转账操作
    * @Date:2019/7/18
    * */
      void transfer(String inter,String outer,Double money);
}
