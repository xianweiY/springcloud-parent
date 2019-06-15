package com.atguigu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EnableConfigServer
@SpringBootApplication
public class DemoConfigServerApplication {

    public static void main(String[] args) {
        Map<String, Object> map = Collections.synchronizedMap(new HashMap<String, Object>());

        SpringApplication.run(DemoConfigServerApplication.class, args);
    }

}
