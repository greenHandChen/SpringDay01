package com.hand.po;

import java.util.List;
import java.util.Map;

public class CollectionBean {
    private String[] array;
    private List<String> list;



    private Map<String,String> map;
    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }}
