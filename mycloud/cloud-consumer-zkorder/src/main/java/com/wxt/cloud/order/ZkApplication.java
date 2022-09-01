package com.wxt.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-20 21:14
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkApplication.class, args);
    }
}
