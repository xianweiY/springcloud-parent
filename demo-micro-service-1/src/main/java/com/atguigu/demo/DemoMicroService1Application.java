package com.atguigu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoMicroService1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroService1Application.class, args);
    }

}
