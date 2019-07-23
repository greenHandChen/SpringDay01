package com.lhb.service;

/**
 * Created By LHB on 2019/7/23;
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "lhb.hello")
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
