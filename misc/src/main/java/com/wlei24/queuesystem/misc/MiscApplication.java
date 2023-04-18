package com.wlei24.queuesystem.misc;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wlei24
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableApolloConfig
@MapperScan("com.wlei24.queuesystem.misc.dao")
public class MiscApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiscApplication.class, args);
    }
}