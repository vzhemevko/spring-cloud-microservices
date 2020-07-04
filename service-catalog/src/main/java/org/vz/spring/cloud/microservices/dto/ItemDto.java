package org.vz.spring.cloud.microservices.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {
    
    @Builder.Default
    private String description = "Object retrieved from CATALOG Microservice";
    private String name;
    private String catalogName;
}
