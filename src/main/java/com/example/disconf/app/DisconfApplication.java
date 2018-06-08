package com.example.disconf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/6/8 10:34
 */
@ImportResource({"classpath:spring-disconf.xml"})
@ComponentScan("com.example.disconf")
@SpringBootApplication
public class DisconfApplication {
    public static void main(String[] args) {
        SpringApplication.run(DisconfApplication.class, args);

    }
}
