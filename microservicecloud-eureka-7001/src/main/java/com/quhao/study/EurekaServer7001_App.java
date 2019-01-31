package com.quhao.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Stephen
 * @create: 2019-01-03 09:55
 **/
@SpringBootApplication
@EnableEurekaServer  // eureka 服务端启动类，接受其他微服务注册进来
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}
