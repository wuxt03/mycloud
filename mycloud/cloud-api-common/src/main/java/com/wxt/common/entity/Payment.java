package com.wxt.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:44
 * @version: 1.0
 */
@Data
@TableName("payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String serial;
}
