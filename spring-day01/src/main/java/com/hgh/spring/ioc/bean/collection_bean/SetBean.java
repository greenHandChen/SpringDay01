package com.hgh.spring.ioc.bean.collection_bean;

import java.util.Set;

public class SetBean {
    private Set<String> set;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "SetBean{" +
                "set=" + set +
                '}';
    }
}
