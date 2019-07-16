package com.lhb.spring.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created By LHB on 2019/7/16;
 */
public class CollectionBean {
    private String[] arrary;
    private List<String> list;

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
