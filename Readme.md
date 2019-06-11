springcloud 微服务demo<br/>

zuul服务网关，提供路由，负载均衡。<br/>
包括fallback熔断器，filter过滤器<br/>


micro-service  微服务调用者；<br/>
provider       微服务提供者；<br/>

其实无所谓  调用者  和  提供者  ，本质上两者都是微服务，通过controller提供对外接口<br/>
都可以互相调用，只是在本demo中，测试的是micro-service调用provider。<br/>

hystrix的配置使用：<br/>
    1.zuul网关：实现FallbackProvider接口，配置对应服务的熔断处理逻辑<br/>
    2.restTemplate： 依赖hystrix， 注解指定熔断处理逻辑方法 @HystrixCommand(fallbackMethod = "fallErr")<br/>
    3.feign ：feign启动器已经依赖了hystrix，只需要去配置文件开启hystrix，然后继承 对应的远程服务映射接口，指定配置类，和熔断器处理类<br/>
        @FeignClient(name="DEMO-PROVIDER-ONE",configuration = FeignConfig.class,fallback = DemoHystrix.class)<br/>
<br/>
熔断器，监控面板配置参考：https://blog.csdn.net/qq_34310242/article/details/80873966<br/>