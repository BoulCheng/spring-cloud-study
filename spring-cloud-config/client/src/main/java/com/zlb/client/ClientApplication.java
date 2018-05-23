package com.zlb.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
        SpringApplication.run(ClientApplication.class, args);
    }
}
