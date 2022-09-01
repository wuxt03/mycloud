package com.wxt.common.cloud.order;

import com.wxt.cloud.irule.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-16 15:43
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PAYMENT-SERVICE",configuration = MySelfRule.class)
public class CloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudOrderApplication.class, args);
    }
}
