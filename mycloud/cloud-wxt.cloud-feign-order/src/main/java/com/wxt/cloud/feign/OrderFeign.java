package com.wxt.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-21 20:30
 * @version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderFeign {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign.class, args);
    }
}
