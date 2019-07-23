package com.ll.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @package com.xxx.springboot.web
 * @Author LL
 * @ClassName HelloProperties
 * @Date 2019/7/23  21:34
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
