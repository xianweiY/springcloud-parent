/**
 * 
 */
package com.atguigu.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author Administrator
 *	Spring Cloud 2.0 以上 的security默认启用了csrf检验，要在eurekaServer端配置security的csrf检验为false 
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
        // 取消csrf验证
        http.csrf().disable();
        // 若使用 http://${user}:${password}@${host}:${port}/eureka/方式， 需是httpBasic验证
        // 若使用form方式，不能使用url格式登录
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
