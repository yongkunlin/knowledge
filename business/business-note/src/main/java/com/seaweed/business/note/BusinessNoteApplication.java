package com.seaweed.business.note;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lyk
 * 业务模块启动类
 */
@EnableEurekaClient
@EnableFeignClients("com.seaweed")
@SpringBootApplication
public class BusinessNoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessNoteApplication.class, args);
    }

}


