package com.wxt.cloud.payment.zook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-20 20:45
 * @version: 1.0
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("get")
    public String  getPort(){
        return "server port is"+port+"\t"+ UUID.randomUUID().toString();
    }
}
