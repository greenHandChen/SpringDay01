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
    @Override
    public List<Account> findUserByMoney(Double money) {
             return userDao.findUserByMoney(money);
    }
    public List<SellerAndManager> findSellerAndManagerByGoodsName(String goodName){
             return userDao.findSellerAndManagerByGoodsName(goodName);
    }
    public List<SellerAndManager> findSellerAndSellerRecords(){
        return userDao.findSellerAndSellerRecords();
    }
    public List<OrdersExt> getOrderExtByOrderId(int id){
        System.out.println(id);
        return userDao.getOrderExtByOrderId(id);
    }
    public List<OrdersExt> findOrdersByResultMap(int id){
        return userDao.findOrdersByResultMap(id);
    };
    public List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt){
        return userDao.findOrdersAndOrderDetail(ordersExt);
    }
}
