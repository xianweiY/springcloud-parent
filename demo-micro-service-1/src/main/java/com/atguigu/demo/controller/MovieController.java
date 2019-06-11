/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: MovieController
 * @Package com.atguigu.demo.controller
 * @author: YangXianWei
 * @date: 2019/6/10 16:36
 * @since JDK 1.8
 */
package com.atguigu.demo.controller;

import com.atguigu.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @ClassName : MovieController
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 16:36  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/order")
    public Map<String, Object> order(Integer uId) {
        Map<String, Object> order = new HashMap<>();

        order.put("order", UUID.randomUUID().toString().substring(0, 10));
        // 1.查询用户
        // String username =
        // restTemplate.getForObject("http://USER-SERVICE/user?id="+uId, String.class);

        // order.put("username", username);
        // 2.查询电影

        // String moviename = restTemplate.getForObject("http://MOVIE-SERVICE/movie",
        // String.class);
        Person person = new Person();
        person.setName("远程调用");
        ResponseEntity<String> postForEntity = restTemplate.postForEntity("http://DEMO-PROVIDER-ONE/getMovie", person,
                String.class);
        // String moviename = restTemplate.getForObject("http://MOVIE-SERVICE/movie",
        // String.class, person);
        order.put("movie", postForEntity.getBody());
        System.out.println("服务版本号001");
        return order;
    }
}
