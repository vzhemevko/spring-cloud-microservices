package org.vz.spring.cloud.microservices.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ItemDto {
    
    @Builder.Default
    private String description = "Object retrieved from ITEM Microservice";
    private String name;
    private String catalogName;
}
