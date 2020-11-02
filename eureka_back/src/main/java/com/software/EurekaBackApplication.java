package com.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/10/29
 * @description Eureka 启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBackApplication.class, args);
    }
}
