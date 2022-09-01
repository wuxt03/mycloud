package com.wxt.alibaba.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-31 15:16
 * @version: 1.0
 */
@RestController
@Slf4j
@RefreshScope
public class ConsumerController {

    @Value("${serverInfo.url}")
    private String serverUrl;

    @Value("${confing.info}")
    private String info;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/consumer/echo/{string}")
    public String echo(@PathVariable("string") String msg){
        return restTemplate.getForObject(serverUrl+"/echo/"+msg, String.class);
    }

    @GetMapping("/consumer/config/info")
    public String getInfo(){
        return info;
    }
}
