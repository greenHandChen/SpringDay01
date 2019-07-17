package com.ljx.spring_transaction.test;

import com.ljx.service.IAccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 半自动式(不需要配置任何有关于事务的内容)
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 22:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-service01.xml", "classpath*:applicationContext-dao.xml"})
public class Test01 {

    @Resource(name = "accountServiceProxy")
    private IAccountService iAccountService;

    @org.junit.Test
    public void transfer() {

        iAccountService.transfer("mybatis","hibernate",1.0);
        System.out.println("dd");
    }
}
