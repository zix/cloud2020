package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡路由规则类
 *
 * @author zzyy
 * @date 2020/3/6 15:15
 **/
@Configuration
public class MyRule {

    @Bean
    public IRule myRule() {
        // 定义为随机
        return new RandomRule();
    }
}
