package com.wxt.cloud.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-21 22:00
 * @version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLevel(){
        return Logger.Level.FULL;
    }
}
