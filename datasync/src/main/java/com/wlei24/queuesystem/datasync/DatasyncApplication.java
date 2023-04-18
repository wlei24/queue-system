package com.wlei24.queuesystem.datasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DatasyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatasyncApplication.class, args);
    }
}
