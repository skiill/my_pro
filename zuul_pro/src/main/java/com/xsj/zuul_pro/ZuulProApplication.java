package com.xsj.zuul_pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulProApplication.class, args);
    }

}
