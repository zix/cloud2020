package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/configInfo")
    public String getServerPort() {
        System.out.println("===>"+System.getProperty("spring.profiles.active")+"  serverPort: "+serverPort);
        return configInfo+"  "+serverPort;
    }
}
