/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: MyFallbackProvider
 * @Package com.atguigu.demo.fallback
 * @author: YangXianWei
 * @date: 2019/6/11 16:13
 * @since JDK 1.8
 */
package com.atguigu.demo.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * @ClassName : MyFallbackProvider
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/11 16:13
 * @DESCRIPTION : TODO(熔断器)
 * @since JDK 1.8
 */
@Component
public class MyFallbackProvider implements FallbackProvider {
    @Override
    public String getRoute() {
         //如果需要所有的路由服务都加熔断功能，需要在getRoute()方法上返回'*'的匹配符 return "*";

        return "DEMO-MICRO-SERVICE-1";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        System.out.println("route:" + route);
        System.out.println("exception:" + cause.getMessage());
        HashMap<String, Object> result = new HashMap<>();
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "ok";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("oooops!error,i'm the fallback.".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }
}
