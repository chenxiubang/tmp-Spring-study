package com.cxb;

import com.cxb.service.SpringService;
import lombok.var;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("你使用的代理是 " + context.getBean("proxyFactoryBean").getClass().getName());
        var bean = (SpringService) context.getBean("proxyFactoryBean");

        //测试throwsAdvice
        //bean.method();
        bean.update();
    }
}
