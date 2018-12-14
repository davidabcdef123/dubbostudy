package com.david.dubbo.service;

import com.david.dubbo.api.IHelloService;

/**
 * Created by sc on 2018/12/13.
 */
public class HelloServiceImpl2 implements IHelloService {
    @Override
    public String sayHello(String msg) {
        return "Hello, Version2.0:"+msg;
    }
}
