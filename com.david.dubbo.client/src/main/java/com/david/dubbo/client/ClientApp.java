package com.david.dubbo.client;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.david.dubbo.api.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by sc on 2018/12/13.
 */
public class ClientApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-client.xml"});
        context.start();
        IHelloService helloService = (IHelloService) context.getBean("demoService");//获取远程服务代理
        String hello = helloService.sayHello("world");
        System.err.println(hello);

        //todo 一直不行
       // Protocol protocol=ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("defineProtocol");

       /* Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("defineProtocol");
        System.out.println(protocol.getDefaultPort());
        System.in.read();*/
    }
}
