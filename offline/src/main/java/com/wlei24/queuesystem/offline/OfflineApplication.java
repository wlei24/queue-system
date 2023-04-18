package com.wlei24.queuesystem.offline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wlei24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OfflineApplication {
    public static void main(String[] args) {
        SpringApplication.run(OfflineApplication.class, args);
    }
}
