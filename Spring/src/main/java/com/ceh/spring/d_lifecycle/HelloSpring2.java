package com.ceh.spring.d_lifecycle;

public class HelloSpring2 {
    private String info = "生命周期";

    public void initBean() {
        System.out.println("数据库连接配置完成");
    }

    public void destoryBean() {
        System.out.println("当前数据库连接已被关闭");
    }

    public void test() {
        System.out.println("this's HelloSpring2");
    }
}
