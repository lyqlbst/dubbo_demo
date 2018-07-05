package com.dubbo.client;

import com.dubbo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping(value = "/", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test() {
        return testService.sayHello("LinYuqiang");
    }
}
