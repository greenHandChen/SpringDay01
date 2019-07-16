public class HelloSpring {
    private String info="生命周期";

    public void initBean(){
        System.out.println("数据库连接完成");
    }

    public void destoryBean(){
        System.out.println("当前数据库连接以关闭");
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
