package com.zcy.springbootDemo.Exception;

/**
 * Created by 491445 on 2018/7/6.
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String msg) {
        super(msg);
    }
}
