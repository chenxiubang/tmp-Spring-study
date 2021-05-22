package com.cxb.service.controller;

import com.cxb.service.SpringService;

public class SpringServlet {
    private SpringService service;

    public void setService(SpringService service) {
        this.service = service;
    }

    public void method() {
        service.delete();
    }

}
