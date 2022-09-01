package com.wxt.common.cloud.payment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxt.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:38
 * @version: 1.0
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
