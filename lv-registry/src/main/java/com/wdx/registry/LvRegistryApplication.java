package com.wdx.registry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wdx
 */
@SpringBootApplication
@EnableEurekaServer
public class LvRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LvRegistryApplication.class, args);
    }
}
