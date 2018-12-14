package com.david.dubbo.service;

import com.david.dubbo.api.IHelloService;

/**
 * Created by sc on 2018/12/13.
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String msg) {
        System.out.println("Server receive:"+msg);
        return "Hello,"+msg;
    }
}
