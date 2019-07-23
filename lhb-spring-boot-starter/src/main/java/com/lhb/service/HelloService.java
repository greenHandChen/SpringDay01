package com.lhb.service;

/**
 * Created By LHB on 2019/7/23;
 */
public class HelloService {
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name ) {
        return helloProperties.getPrefix()+ "-" + name + helloProperties.getSuffix();
    }

}
