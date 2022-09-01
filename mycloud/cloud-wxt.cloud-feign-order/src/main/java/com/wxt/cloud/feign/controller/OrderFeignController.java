package com.wxt.cloud.feign.controller;

import com.wxt.cloud.feign.service.PaymentFeignService;
import com.wxt.common.entity.CommonResult;
import com.wxt.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-21 20:43
 * @version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment")
    public CommonResult<Payment> getPayment(String id){
        log.info("id={}",id);
        return paymentFeignService.getPayment(id);
    }
}
