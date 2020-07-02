package org.vz.spring.cloud.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogServiceStarter {
    
    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceStarter.class, args);
    }
}
