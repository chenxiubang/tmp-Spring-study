package com.cxb.service.advice;

import org.springframework.aop.ThrowsAdvice;

public class SpringThrowsAdvice implements ThrowsAdvice {
    //ThrowsAdvice 接口是个标记接口
    public void afterThrowing(ArithmeticException ex) throws Throwable {
        System.out.println("连接点抛出异常：ArithmeticException");
    }
}
