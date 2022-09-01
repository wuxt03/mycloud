package com.wxt.cloud.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-20 21:17
 * @version: 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://payment-zookeeper";
    @GetMapping("/consumer/paymentzk")
    public String getPaymentOrder(){
        String object = restTemplate.getForObject(PAYMENT_URL+"/payment/get", String.class);
        return object;
    }
}
