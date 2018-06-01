package com.zlb.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {
    public static void main(String[] args) {
        //http://blog.didispace.com/spring-cloud-starter-dalston-1/
        //http://localhost:7011/
        new SpringApplicationBuilder(SpringCloudEurekaServerApplication.class).web(true).run(args);
    }
}
