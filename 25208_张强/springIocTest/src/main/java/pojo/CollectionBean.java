package pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by zq on 2019/7/16
 */
public class CollectionBean {
    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }


}
