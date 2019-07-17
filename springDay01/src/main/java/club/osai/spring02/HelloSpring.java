package club.osai.spring02;

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

    public void init() {

        System.out.println("init Class !");
    }

    public void destroy() {

        System.out.println("destroy Class !");
    }
}
