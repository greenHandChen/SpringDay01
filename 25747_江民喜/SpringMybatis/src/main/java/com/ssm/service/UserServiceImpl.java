package com.ssm.service;

import com.ssm.dao.IUserDao;
import com.ssm.model.Account;
import com.ssm.model.OrdersExt;
import com.ssm.model.SellerAndManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by minxi.jiang on  2019/7/18
 * */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;
    List<OrdersExt> finOrdersExt(OrdersExts ordersExts){
        return userDao.finOrdersExt(ordersExts);

    }
}
