package com.ll.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @package com.xxx.springboot.web
 * @Author LL
 * @ClassName HelloService
 * @Date 2019/7/23  21:33
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String name){
        return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
