package com.demo.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
    private String[] array;

    private List<String> list;

    private Set<String> set;

    private Map<String, String> map;

    public Map<String, String> getMap() {

        return map;

    }

    public void setMap(Map<String, String> map) {

        this.map = map;

    }

    public List<String> getList() {

        return list;

    }

    public void setList(List<String> list) {

        this.list = list;

    }

    public Set<String> getSet() {

        return set;

    }

    public void setSet(Set<String> set) {

        this.set = set;

    }
    public String[] getArray() {

        return array;

    }
    public void setArray(String[] array) {

        this.array = array;

    }
}
