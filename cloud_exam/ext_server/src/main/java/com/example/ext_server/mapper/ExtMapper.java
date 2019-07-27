package com.example.ext_server.mapper;

import com.example.ext_server.po.Ext;

import java.util.List;

public interface ExtMapper {

    int insert(Ext ext);

    int del(int[] ids);

    List<Ext> select(Ext ext);

    int update(Ext ext);

}
