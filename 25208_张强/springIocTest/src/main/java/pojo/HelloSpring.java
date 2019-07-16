package pojo;

/**
 * Created by zq on 2019/7/16
 */
public class HelloSpring {
    private String info;
    private DISpring diSpring;
    public String getInfo() {
        return info;
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }
    public void initBean(){
        System.out.println("数据库连接配置完成");
    }
    public void destoryBean(){
        System.out.println("当前数据库连接配置已关闭");

    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String helloDI(){
        return diSpring.getInfo();
    }
}
