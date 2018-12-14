package com.david.dubbo.client;

import com.david.dubbo.api.IHelloService;

/**
 * Created by sc on 2018/12/13.
 */
public class TestMock implements IHelloService {
    @Override
    public String sayHello(String msg) {
        return "系统繁忙"+msg;
    }
}
