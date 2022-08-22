package com.yuanerya.mycommunity.common.exception;

import com.yuanerya.mycommunity.common.api.IErrorCode;


public class ApiAsserts {
    /**
     * 抛失败异常
     *
     * @param message 说明
     */
    public static void fail(String message) {
        throw new com.yuanerya.mycommunity.common.exception.ApiException(message);
    }

    /**
     * 抛失败异常
     *
     * @param errorCode 状态码
     */
    public static void fail(IErrorCode errorCode) {
        throw new com.yuanerya.mycommunity.common.exception.ApiException(errorCode);
    }
}
