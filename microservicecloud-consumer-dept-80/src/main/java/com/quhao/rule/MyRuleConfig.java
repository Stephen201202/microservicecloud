package com.quhao.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡算法
 * @author: Stephen
 * @create: 2019-01-04 13:05
 **/
@Configuration
public class  MyRuleConfig {
    @Bean
    public IRule mySelfRule() {
//        return new MyRule();
        return new RandomRule();
    }
}
