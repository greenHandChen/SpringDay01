package xmlConfig;

public class HelloSpring {
    private String info;
    private DISpring diSpring;

    public void helloDI(){
        diSpring.helloDI();
    }

    public void initBean(){
        System.out.println("初始化Beans");
    }

    public void destoryBean(){
        System.out.println("销毁Beans");
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
