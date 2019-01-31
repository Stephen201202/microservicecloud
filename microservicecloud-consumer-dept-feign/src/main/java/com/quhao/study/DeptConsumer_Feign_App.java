package com.quhao.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Stephen
 * @create: 2019-01-02 16:40
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.quhao.study"})
@ComponentScan("com.quhao.study")
public class DeptConsumer_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Feign_App.class, args);
    }
}
