/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: TestConfigController
 * @Package com.atguigu.demo.controller
 * @author: apple
 * @date: 2019-06-14 10:15
 * @since JDK 1.8
 */
package com.atguigu.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @ClassName : TestConfigController
 * @AUTHOR :  apple
 * @DATE :    2019-06-14 10:15  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
@RestController
public class TestConfigController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/getfoo",method = RequestMethod.GET)
    public String getFoo(){
        return foo;
    }
}
