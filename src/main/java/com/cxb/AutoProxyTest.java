package com.cxb;

import com.cxb.service.controller.SpringServlet;
import lombok.var;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoProxyTest {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var servlet = context.getBean("springServlet", SpringServlet.class);
        servlet.method();
    }
}
