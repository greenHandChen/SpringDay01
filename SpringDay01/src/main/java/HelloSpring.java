public class HelloSpring {

    private String info = "生命周期";

    private DISpring diSpirng;

    public void initBean(){
        System.out.println("数据库连接配置完毕");
    }

    public void destoryBean(){
        System.out.println("当前数据库连接已被关闭");
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
