package org.vz.spring.cloud.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceStarter {
    
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceStarter.class, args);
    }
}
