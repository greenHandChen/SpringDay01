package com.dragon.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 20:31 2019/7/23
 * @Modified By:
 */
//绑定引用的配置文件中的dragon.starter配置
//属性为HelloProperties中的属性
//这里相当于bean的properties，可以在 引用了该starter的项目中的 spring.properties或者spring.yml中进行配置
@ConfigurationProperties(prefix = "dragon.starter")
public class HelloProperties {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
