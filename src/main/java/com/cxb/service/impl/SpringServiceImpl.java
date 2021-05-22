package com.cxb.service.impl;

import com.cxb.service.SpringService;
import lombok.var;
import org.springframework.aop.framework.AopContext;

public class SpringServiceImpl implements SpringService {
    @Override
    public void method() {
        System.out.println("开始执行业务");
        int a = 1 / 0;
        System.out.println("完成业务");
    }

    @Override
    public void update() {
        //获得当前暴露的代理对象
        var proxy = (SpringService)AopContext.currentProxy();
        proxy.delete();
        proxy.insert();
    }

    @Override
    public void delete() {
        System.out.println("先执行了删除操作");
    }

    @Override
    public void insert() {
        System.out.println("后执行了插入操作");
    }
}
