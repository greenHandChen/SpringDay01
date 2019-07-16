import java.util.List;

public class Women {

    private String[] info;
    private List<String> list;

    public void setInfo(String[] info) {
        this.info = info;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getInfo() {
        System.out.println(info);
        return info;
    }

    public List<String> getList() {
        return list;
    }
}
