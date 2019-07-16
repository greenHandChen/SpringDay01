package club.osai.spring01;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: DISpring.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */

public class DISpring {
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "DISpring{" +
                "hello='" + hello + '\'' +
                '}';
    }

}
