package com.seaweed.corebaseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 系统核心api启动类
 *
 * @author lyk
 */
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class CoreBaseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreBaseApiApplication.class, args);
    }

}
