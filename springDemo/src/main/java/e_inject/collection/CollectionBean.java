package e_inject.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
    private List list;
    private int[] array;
    private Set set;
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
