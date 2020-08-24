package com.wei.chong.root.weichongorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WeiChongOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiChongOrderApplication.class, args);
    }

}
