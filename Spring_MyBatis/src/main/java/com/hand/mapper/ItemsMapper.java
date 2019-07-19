package com.hand.mapper;

import com.hand.entity.UserOrderItemDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemsMapper {
    public List<UserOrderItemDetail> selectAllMeaage();
}
