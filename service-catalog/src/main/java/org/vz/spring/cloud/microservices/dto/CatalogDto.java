package org.vz.spring.cloud.microservices.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class CatalogDto {
    
    @Builder.Default
    private String description = "Object retrieved from CATALOG Microservice";
    private String name;
    private List<ItemDto> items;
}

