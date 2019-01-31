package com.quhao.study;

import com.quhao.rule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: Stephen
 * @create: 2019-01-02 16:40
 **/
@SpringBootApplication
@EnableEurekaClient
// 在启动该微服务的时候就能去加载我们自定义的Ribbon配置类，从而使配置生效
// 注意： MyRule不能放在@ComponentScan 扫描的包下
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MyRuleConfig.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
