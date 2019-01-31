package com.quhao.study.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Stephen
 * @create: 2019-01-02 15:06
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套 客户端 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    // Ribbon负载均衡算法重置：用重新选择的算法代替默认的轮循算法
//    @Bean
    public IRule getIRule() {
//        return new RandomRule();
        return new RetryRule();  // 先按照轮循的策略查栈服务，如果获取服务失败则在指定时间内进行重试，获取新服务
    }
}
