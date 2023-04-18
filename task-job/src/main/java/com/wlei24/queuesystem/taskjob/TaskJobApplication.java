package com.wlei24.queuesystem.taskjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wlei24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TaskJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskJobApplication.class, args);
    }
}
