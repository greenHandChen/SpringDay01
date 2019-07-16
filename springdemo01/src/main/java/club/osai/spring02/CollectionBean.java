package club.osai.spring02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: CollectionBean.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */

public class CollectionBean {


    private List<String> list;
    private String[] strings;
    private Set<String> set;
    private Map<String, String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

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

    @Override
    public String toString() {
        return "CollectionBean{" +
                "list=" + list +
                ", strings=" + Arrays.toString(strings) +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
