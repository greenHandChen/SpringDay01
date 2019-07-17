package com.ljx.dao.impl;

import com.ljx.dao.PersonDao;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao {
    @Override
    public void insert() {
        System.out.println("持久化以上数据");
    }
}
