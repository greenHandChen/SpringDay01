package com.hand.servicetest.Mapper;

import com.hand.servicetest.Entity.Dept;
import javafx.scene.DepthTest;

import java.util.List;

public interface UserMapper {
    Dept findDeftById(Integer id);
    Integer deleteUDsById(Integer id);
    Integer addDept(Dept dept);

    void updateById(Dept dept);
}
