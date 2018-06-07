package com.zlb.client.web;

import com.alibaba.fastjson.JSON;
import com.zlb.client.entity.PropertyDto;
import com.zlb.client.modules.fota.service.UserService;
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

    @Autowired
    private UserService userService;

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

    @RequestMapping("/username3")
    public String username3() {
        String users = JSON.toJSONString(userService.listAllBUser());
        System.out.println("users: " + users);
        return users;
    }
}