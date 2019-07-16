package com.softeem.spring2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean{

    private String[] array;
    private List<String> list;
    private Set<Integer> set;
    private Map<String,Object> map;

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public String[] getArray() {
        return array;
    }

    public List<String> getList() {
        return list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "CollectionBean{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

}
