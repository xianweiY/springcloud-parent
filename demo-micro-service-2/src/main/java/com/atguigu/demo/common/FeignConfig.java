/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: FeignConfig
 * @Package com.atguigu.demo.common
 * @author: YangXianWei
 * @date: 2019/6/11 16:41
 * @since JDK 1.8
 */
package com.atguigu.demo.common;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 *
 * @ClassName : FeignConfig
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/11 16:41  
 * @DESCRIPTION : TODO(feign配置类)
 * @since JDK 1.8
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1),5);
    }
}
