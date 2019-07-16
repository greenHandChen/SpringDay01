import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CollectionBean {
    private String[] array;
    private List<String> list;
    private Set<String> set;
    private HashMap<String,String> hashMap;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

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
}
