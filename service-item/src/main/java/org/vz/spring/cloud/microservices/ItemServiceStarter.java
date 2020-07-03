package org.vz.spring.cloud.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ItemServiceStarter {
    
    public static void main(String[] args) {
        SpringApplication.run(ItemServiceStarter.class, args);
    }
}
