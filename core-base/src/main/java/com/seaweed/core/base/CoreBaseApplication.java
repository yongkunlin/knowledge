package com.seaweed.core.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 系统核心启动类
 * EnableDiscoveryClient 声明自己为提供方
 *
 * @author lyk
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CoreBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreBaseApplication.class, args);
    }

}
