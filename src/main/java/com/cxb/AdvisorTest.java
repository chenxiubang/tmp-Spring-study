package com.cxb;

import com.cxb.service.SpringService;
import lombok.var;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvisorTest {
    public static void main(String[] args) {
        var context =new ClassPathXmlApplicationContext("application.xml");
        var bean = (SpringService) context.getBean("proxyFactoryBean");
        bean.delete();
    }
}
