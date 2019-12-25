package com.seaweed.corebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 系统核心启动类
 *
 * @author lyk
 */
@EnableEurekaClient
@SpringBootApplication
public class CoreBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreBaseApplication.class, args);
    }

}