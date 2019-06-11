/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: DemoHystrix
 * @Package com.atguigu.demo.common
 * @author: YangXianWei
 * @date: 2019/6/11 16:42
 * @since JDK 1.8
 */
package com.atguigu.demo.common;

import com.atguigu.demo.bean.Person;
import com.atguigu.demo.remoteService.RemoteService;
import org.springframework.stereotype.Component;

/**
 *
 * @ClassName : DemoHystrix
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/11 16:42  
 * @DESCRIPTION : TODO(熔断器配置类)
 * @since JDK 1.8
 */
@Component
public class DemoHystrix implements RemoteService {
    @Override
    public String getRemoteService(Person person) {
        return "sorry ,error!  这是熔断器配置类下的返回值！！！！";
    }
}
