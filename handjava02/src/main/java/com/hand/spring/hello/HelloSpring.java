package com.hand.spring.hello;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 15:40
 */
public class HelloSpring {
    private String info;
    private  DISpring DiSpring;

    public void initBean()
    {
        System.out.println("数据库连接成功");
    }
    public void destoryBean()
    {
        System.out.println("数据库链接已经关闭");
    }
    public DISpring getDiSpring() {
        return DiSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        DiSpring = diSpring;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
