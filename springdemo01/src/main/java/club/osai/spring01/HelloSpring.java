package club.osai.spring01;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: club.osai.spring01.HelloSpring.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */


public class HelloSpring {
    private String info;
    private DISpring diSpring;


    public HelloSpring() {
    }

    public HelloSpring(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public void setDiSpringWithStirng(String diSpring) {
        this.diSpring.setHello(diSpring);
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "info='" + info + '\'' +
                ", diSpring=" + diSpring +
                '}';
    }
}
