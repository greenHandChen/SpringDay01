package com.hand.zhang.bean;

/**
 * ClassName:SpringHello
 * Author:ZhangChunjia
 * Date:2019/7/16 10:09
 */
public class SpringHello {
    public void getInfo() {
        System.out.println("你好");
    }

    public void initBean() {
        System.out.println("初始化..");
    }

    public void destroyBean(){
        System.out.println("销毁...");
    }
}
