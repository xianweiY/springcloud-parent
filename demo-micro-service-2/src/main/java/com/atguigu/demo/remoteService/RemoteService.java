/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: RemoteService
 * @Package com.atguigu.demo
 * @author: YangXianWei
 * @date: 2019/6/10 17:54
 * @since JDK 1.8
 */
package com.atguigu.demo.remoteService;

import com.atguigu.demo.bean.Person;
import com.atguigu.demo.common.DemoHystrix;
import com.atguigu.demo.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @ClassName : RemoteService
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 17:54  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
@FeignClient(name="DEMO-PROVIDER-ONE",configuration = FeignConfig.class,fallback = DemoHystrix.class)
public interface RemoteService {

    @RequestMapping("/getMovie")
    public String getRemoteService(@RequestBody Person person);
}
