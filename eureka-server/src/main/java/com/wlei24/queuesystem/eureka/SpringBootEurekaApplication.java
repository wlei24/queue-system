package com.wlei24.queuesystem.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wlei24
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaApplication.class, args);
    }
}
