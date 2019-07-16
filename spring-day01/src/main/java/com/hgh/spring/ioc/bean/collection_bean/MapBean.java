package com.hgh.spring.ioc.bean.collection_bean;

import java.util.Map;

public class MapBean {
    private Map<String,String> map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "MapBean{" +
                "map=" + map +
                '}';
    }
}
