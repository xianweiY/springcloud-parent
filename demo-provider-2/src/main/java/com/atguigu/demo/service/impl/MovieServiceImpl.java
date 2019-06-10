/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: MovieServiceImpl
 * @Package com.atguigu.demo.service.impl
 * @author: YangXianWei
 * @date: 2019/6/10 16:23
 * @since JDK 1.8
 */
package com.atguigu.demo.service.impl;

import com.atguigu.demo.bean.Person;
import com.atguigu.demo.service.MovieService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName : MovieServiceImpl
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 16:23
 * @DESCRIPTION : TODO(用一句话描述该类做什么)
 * @since JDK 1.8
 */
@RestController
public class MovieServiceImpl implements MovieService {


    @RequestMapping("/getMovie")
    @Override
    public String getMovie(@RequestBody Person person) {

        return "《红楼梦》" + person.getName() + " uuid:" + UUID.randomUUID().toString().substring(0, 5);
    }
}
