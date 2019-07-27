package com.example.ext_server.service;

import com.example.ext_server.mapper.ExtMapper;
import com.example.ext_server.po.Ext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExtServiceImpl implements IExtService {

    @Autowired
    ExtMapper extMapper;

    @Override
    public int insert(Ext ext) {
        return extMapper.insert(ext);
    }

    @Override
    public int del(int[] ids) {
        return extMapper.del(ids);
    }

    @Override
    public List<Ext> select(Ext ext) {
        return extMapper.select(ext);
    }

    @Override
    public int update(Ext ext) {
        return extMapper.update(ext);
    }
}
