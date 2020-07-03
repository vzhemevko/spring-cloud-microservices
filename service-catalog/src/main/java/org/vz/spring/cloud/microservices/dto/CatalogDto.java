package org.vz.spring.cloud.microservices.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class CatalogDto {
    
    private String name;
    private List<ItemDto> items;
}

