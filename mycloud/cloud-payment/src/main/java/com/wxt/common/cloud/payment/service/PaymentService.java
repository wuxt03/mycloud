package com.wxt.common.cloud.payment.service;

import com.wxt.common.entity.Payment;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:53
 * @version: 1.0
 */
public interface PaymentService {

    int save(Payment payment);

    Payment findById(String id);
}
