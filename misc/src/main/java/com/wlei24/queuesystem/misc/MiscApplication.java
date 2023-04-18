package com.wlei24.queuesystem.misc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wlei24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MiscApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiscApplication.class, args);
    }
}