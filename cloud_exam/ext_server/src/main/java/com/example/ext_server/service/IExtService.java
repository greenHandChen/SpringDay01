package com.example.ext_server.service;

import com.example.ext_server.po.Ext;

import java.util.List;

public interface IExtService {
    int insert(Ext ext);

    int del(int[] ids);

    List<Ext> select(Ext ext);

    int update(Ext ext);
}
