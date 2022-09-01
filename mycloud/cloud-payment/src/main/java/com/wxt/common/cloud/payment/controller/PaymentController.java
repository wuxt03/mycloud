package com.wxt.common.cloud.payment.controller;


import com.wxt.common.cloud.payment.service.PaymentService;
import com.wxt.common.entity.CommonResult;
import com.wxt.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:57
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    String port;
    @Autowired
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public CommonResult savePayment(@RequestBody Payment payment) {
        CommonResult commonResult = CommonResult.builder().code(200).msg("保存成功").build();
        int num = paymentService.save(payment);
        if(num == 1){
            return commonResult;
        }else {
            commonResult = new CommonResult(201,"保存失败");
        }
        return commonResult;
    }

    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") String id){
        CommonResult commonResult = CommonResult.builder().code(200).build();
        String msg = "获取成功,server端口为"+port;
        Payment payment = paymentService.findById(id);
        commonResult.setData(payment);
        commonResult.setMsg(msg);
        return commonResult;
    }

    @GetMapping("/discovery")
    public Object getDisCovery(){
        List<String> services = discoveryClient.getServices();//获取服务列表
        for (String server:services) {
            log.info("server*****",server);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-SERVICE");//获取每个服务下的实例
        for (ServiceInstance instance : instances) {
            log.info("instance是"+instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort());
        }
        return this.discoveryClient;
    }
}
