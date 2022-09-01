package com.wxt.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-15 20:49
 * @version: 1.0
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T>{

    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg){
        this(code,msg,null);
    }
}
