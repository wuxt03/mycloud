package com.wxt.cloud.feign.service;

import com.wxt.common.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-21 20:40
 * @version: 1.0
 */
@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/cloud-payment/payment/get/{id}")
    CommonResult getPayment(@PathVariable("id") String id);
}
