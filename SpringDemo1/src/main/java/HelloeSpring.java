public class HelloeSpring {
    private String info;
    private  DISpring diSpring;
    public void initBean()
    {
        System.out.println("初始化成功");
    }
    public void destoryBean()
    {
        System.out.println("销毁成功");
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
