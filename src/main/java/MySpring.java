public class MySpring {

    private String info = "Life circle";

    private DISpring diSpirng;

    public void initBean(){
        System.out.println("配置完毕");
    }

    public void destoryBean(){
        System.out.println("连接已被关闭");
    }

    public String getInfo() {
        return info;
    }

    public DISpring getDiSpirng() {
        return diSpirng;
    }

    public void setDiSpirng(DISpring diSpirng) {
        this.diSpirng = diSpirng;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void helloDI(){
        System.out.println(diSpirng.getDI());
    }
}
