package com.wxt.cloud.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-18 21:27
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeServerApplication.class, args);
    }
}
