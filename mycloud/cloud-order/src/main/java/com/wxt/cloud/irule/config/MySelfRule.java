package com.wxt.cloud.irule.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-21 11:00
 * @version: 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getIRule(){
        return  new RandomRule();//自定义负载规则，定义为随机
    }
}
