package com.wxt.common.cloud.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-16 21:35
 * @version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced   //使RestTemplate具有负载均衡的能力，默认轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
