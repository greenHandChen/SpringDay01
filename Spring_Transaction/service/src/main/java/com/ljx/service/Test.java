package com.ljx.service;

import com.ljx.dao.IAccountDao;
import com.ljx.dao.impl.IAccountDaoImpl;
import com.ljx.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 18:08
 */
public class Test {

    @org.junit.Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        IAccountService userDao = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);

        userDao.transfer("mybatis","hibernate",1.0);
        System.out.println("dd");
    }

    public static void main(String[] args) {

    }
}
