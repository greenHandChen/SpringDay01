package d_lifecycle;

import c_scpoe.DISpring;

public class HelloSpring {
    private String info;
    private DISpring diSpring;
    public void initBean(){
        System.out.println("bean初始化完成");
    }
    public void service(){
        System.out.println("bean service");
    }
    public void destoryBean(){
        System.out.println("bean销毁");
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
