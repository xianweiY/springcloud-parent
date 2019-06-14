springcloud 微服务demo,基于springboot2.0.4进行配置<br/>
=======
demo内容含括<br/>
---
            1.zuul(负载均衡&服务降级熔断)-->微服务(负载均衡&服务降级熔断)-->微服务
            2.Eureka(Security安全策略)
            3.RestTemplate调用demo  &  Feign调用demo
            
----------------

zuul服务网关，提供路由，负载均衡。<br/>
包括fallback熔断器，filter过滤器<br/>
            
-----------  

micro-service  微服务；<br/>
provider       微服务；<br/>
demo里面测试了 micro 微服务调用 provider 微服务，并且配置了熔断器和负载均衡。<br/>
  
-----

springcloud其实无所谓  调用者  和  提供者  ，本质上两者都是微服务，通过controller提供对外接口<br/>
都可以互相调用，只是在本demo中，测试的是micro-service调用provider。<br/>

------

hystrix的配置使用：<br/>
-------
    1.zuul网关：实现FallbackProvider接口，配置对应服务的熔断处理逻辑
    2.restTemplate： 依赖hystrix， 注解指定熔断处理逻辑方法 @HystrixCommand(fallbackMethod = "fallErr")
    3.feign ：feign启动器已经依赖了hystrix，只需要去配置文件开启hystrix，然后继承 对应的远程服务映射接口，指定配置类，和熔断器处理类
        @FeignClient(name="DEMO-PROVIDER-ONE",configuration = FeignConfig.class,fallback = DemoHystrix.class)
<br/>


[熔断器，监控面板配置参考](https://blog.csdn.net/qq_34310242/article/details/80873966)
