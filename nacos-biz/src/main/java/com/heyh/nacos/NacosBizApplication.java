package com.heyh.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosBizApplication.class, args);
    }

}
