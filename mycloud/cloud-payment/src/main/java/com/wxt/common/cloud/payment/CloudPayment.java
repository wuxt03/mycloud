package com.wxt.common.cloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:18
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudPayment {

    public static void main(String[] args) {
        SpringApplication.run(CloudPayment.class,args);
    }
}
