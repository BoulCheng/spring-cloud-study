package com.zlb.ribbonserverbackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonServerBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServerBackupApplication.class, args);
    }
}
