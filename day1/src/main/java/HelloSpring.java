


public class HelloSpring {
    private String info;

    public HelloSpring(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "info='" + info + '\'' +
                '}';
    }
}
