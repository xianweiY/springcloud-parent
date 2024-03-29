package com.atguigu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoProvider1Application.class, args);
    }

}
