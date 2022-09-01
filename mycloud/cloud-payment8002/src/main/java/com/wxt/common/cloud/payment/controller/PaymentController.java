package com.wxt.common.cloud.payment.controller;


import com.wxt.common.cloud.payment.service.PaymentService;
import com.wxt.common.entity.CommonResult;
import com.wxt.common.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: w
 * @createDate: 2022-08-15 20:57
 * @version: 1.0
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    String port;
    @Autowired
    private PaymentService paymentService;

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
}
