package com.zlb.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class TestValueController {

    //通过@Value("${from}")绑定配置服务中配置的from属性
    @Value("${datasource.username}")
    private String username;

    @RequestMapping("/username")
    public String queryUserName() {
        return this.username;
    }
}