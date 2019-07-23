package com.dragon.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 20:29 2019/7/23
 * @Modified By:
 */
//这里相当于一个bean,需要被注入 到 引用该starter的项目中
public class HelloSpringBoot {

    //这里相当于bean的properties，可以在 引用了该starter的项目中的 spring.properties或者spring.yml中进行配置
    private HelloProperties helloProperties;

    public String sayHello(String name){
        return name+":"+helloProperties.getContent();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
