package com.cxb.service.advice;

import lombok.var;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.*;

import java.lang.reflect.Method;

public class SpringTransactionalAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("开始执行transaction事物！");
        var result = methodInvocation.proceed();
        System.out.println("关闭transaction事物！");
        return result;
    }
}
