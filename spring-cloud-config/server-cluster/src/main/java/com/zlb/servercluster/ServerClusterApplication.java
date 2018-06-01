package com.zlb.servercluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ServerClusterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerClusterApplication.class).web(true).run(args);
    }
}
