package com.wpb.dao;

import com.wpb.entity.OrderExt;
import com.wpb.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<OrderExt> findOrderExts();
}
