package SpringStudy.SpringDi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 集合注入
 * @Author: TanLinQuan
 * @Date: 2019/7/16 15:34
 * @Version: V1.0
 **/
public class CollectionBean {

    private String[] args;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
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
                "args=" + Arrays.toString(args) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
