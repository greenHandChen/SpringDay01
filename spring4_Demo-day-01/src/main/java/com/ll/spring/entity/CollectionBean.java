package com.ll.spring.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {

    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<Integer, String> map;

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public CollectionBean(String[] array, List<String> list, Set<String> set) {
        this.array = array;
        this.list = list;
        this.set = set;
    }

    public CollectionBean() {
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "array=" + Arrays.toString(array) + "\n" +
                "list=" + list +
                '}' + "\n" +
                "set=" + set + "\n"
                + map;
    }
}
