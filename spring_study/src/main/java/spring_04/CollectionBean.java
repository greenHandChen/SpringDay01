package spring_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionBean {
    private String[] array;

    public List<String> getList() {
        return list;
    }

    private List<String> list;


    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                '}';
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
