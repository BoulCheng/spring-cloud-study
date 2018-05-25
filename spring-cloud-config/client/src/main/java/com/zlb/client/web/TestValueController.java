package com.zlb.client.web;

import com.zlb.client.entity.PropertyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
@RequestMapping("/value")
class TestValueController {

    //通过@Value("${from}")绑定配置服务中配置的from属性
    @Value("${datasource.username}")
    private String username;

    @Autowired
    PropertyDto propertyDto;

    @RequestMapping("/username")
    public String queryUserName() {
        return this.username;
    }

    @RequestMapping("/username2")
    public String queryName() {
        String userName = propertyDto.getUsername();
        System.out.println("userName: " + userName);
        return userName;
    }
}