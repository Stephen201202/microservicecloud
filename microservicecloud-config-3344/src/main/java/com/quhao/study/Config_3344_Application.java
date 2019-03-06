package com.quhao.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Stephen on 2019/3/2.
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_Application {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_Application.class, args);
    }
}
