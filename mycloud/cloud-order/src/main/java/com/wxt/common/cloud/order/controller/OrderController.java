package com.wxt.common.cloud.order.controller;

import com.wxt.common.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-16 15:52
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://PAYMENT-SERVICE";


    @GetMapping("/consumer/getpayment")
    public CommonResult getPaymentInfo(Integer id){
       return restTemplate.getForObject(PAYMENT_URL+"/cloud-payment/payment/get?id="+id,CommonResult.class);
    }
}
