package com.wxt.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-31 15:13
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer6001 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer6001.class, args);
    }
}
