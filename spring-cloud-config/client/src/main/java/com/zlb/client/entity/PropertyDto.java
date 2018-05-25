package com.zlb.client.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 此处使用@RefreshScope注解 TestValueController不使用@RefreshScope注解： http://localhost:7002/value/username2会热更新 http://localhost:7002/value/username不会热更新
 * 此处不使用@RefreshScope注解 TestValueController使用@RefreshScope注解： http://localhost:7002/value/username2不会热更新 http://localhost:7002/value/username会热更新
 */
@RefreshScope
@Component
@ConfigurationProperties(prefix="datasource")
public class PropertyDto implements Serializable {
    private static final long serialVersionUID = -7607303843472668922L;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
