package com.wxt.common.cloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-18 21:54
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudPayment8002 {

    public static void main(String[] args) {
        SpringApplication.run(CloudPayment8002.class, args);
    }
}
