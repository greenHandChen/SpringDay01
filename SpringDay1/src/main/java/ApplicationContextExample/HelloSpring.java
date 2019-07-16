package ApplicationContextExample;

public class HelloSpring {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    private String msg = "生命周期";

    public void initBean() {
        System.out.println("初始化Beans");
    }

    public void desoryBean() {
        System.out.println("销毁Beans");
    }

}
