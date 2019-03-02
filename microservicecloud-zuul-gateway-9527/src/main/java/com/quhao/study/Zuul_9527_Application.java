package com.quhao.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Stephen on 2019/3/2.
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_Application.class, args);
    }
}
