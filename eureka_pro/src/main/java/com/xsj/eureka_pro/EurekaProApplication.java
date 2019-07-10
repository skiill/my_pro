package com.xsj.eureka_pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProApplication.class, args);
    }

}
