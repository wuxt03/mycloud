package com.wxt.common.cloud.payment.service.impl;

import com.wxt.common.cloud.payment.mapper.PaymentMapper;
import com.wxt.common.cloud.payment.service.PaymentService;
import com.wxt.common.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:55
 * @version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public int save(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment findById(String id) {
        return paymentMapper.selectById(id);
    }
}
