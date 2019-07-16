package MavenTest.spring.f_collection.list;

import java.util.Arrays;
import java.util.List;

public class CollectionBean {
    private String[] array;
    private List<String> list;

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
                '}';
    }
}
