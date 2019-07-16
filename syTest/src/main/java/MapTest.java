import java.util.Map;

public class MapTest {
private Map<String,Integer> map;

    public void setMap(Map<String, Integer> map) {

        this.map = map;
    }

    public Map<String, Integer> getMap() {
        System.out.println(map);
        return map;
    }
}
