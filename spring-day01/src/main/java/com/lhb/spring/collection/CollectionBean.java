package com.lhb.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created By LHB on 2019/7/16;
 */
public class CollectionBean {
    private String[] arrary;
    private List<String> list;

    private Set<String> set;

    private Map<String,String> map;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String[] getArrary() {
        return arrary;
    }

    public void setArrary(String[] arrary) {
        this.arrary = arrary;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arrary=" + Arrays.toString(arrary) +
                '}';
    }
}
