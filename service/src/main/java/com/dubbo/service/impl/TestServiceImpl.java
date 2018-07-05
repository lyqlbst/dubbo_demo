package com.dubbo.service.impl;

import com.dubbo.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "hello" + name + "!";
    }
}
