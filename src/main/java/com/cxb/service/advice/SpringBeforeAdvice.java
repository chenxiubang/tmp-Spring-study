package com.cxb.service.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SpringBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before advice 执行了");
    }
}
