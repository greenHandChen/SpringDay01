package SpringTest;

import java.util.Arrays;
import java.util.List;

public class CollectionBean {
    private String[] array;
    private List<String> list;
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

    @Override
    public String toString() {
        return "CollectionBean{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                '}';
    }
}
