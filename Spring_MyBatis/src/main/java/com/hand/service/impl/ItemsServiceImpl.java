package com.hand.service.impl;

import com.hand.entity.UserOrderItemDetail;
import com.hand.mapper.ItemsMapper;
import com.hand.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemsService")
public class ItemsServiceImpl implements IItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<UserOrderItemDetail> getAllMessage() {
        return itemsMapper.selectAllMeaage();
    }
}
