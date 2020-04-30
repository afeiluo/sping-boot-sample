package com.afeiluo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 从使用该 starter 的项目的 application.properties 文件中获取 com.afeiluo.hello 的配置
 */
@ConfigurationProperties(prefix = "com.afeiluo.hello")
public class HelloProperties {
    public static final String DEFAULT_VALUE = "world";
    private String value = DEFAULT_VALUE;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
