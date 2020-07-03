package org.vz.spring.cloud.microservices.controller;

import org.springframework.web.bind.annotation.*;
import org.vz.spring.cloud.microservices.dto.ItemDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/items", produces = APPLICATION_JSON_VALUE)
public class ItemController {
    
    private static final List<ItemDto> itemList = new ArrayList<>();
    static {
        // Normally the this data would come from a datasource (e.x. database)
        // This project is aimed to demonstrate Spring Cloud capabilities.
        // Therefore the data is hardcoded.
        itemList.add(ItemDto.builder().name("Item_1").catalogName("Catalog_1").build());
        itemList.add(ItemDto.builder().name("Item_2").catalogName("Catalog_1").build());
    
        itemList.add(ItemDto.builder().name("Item_3").catalogName("Catalog_2").build());
        itemList.add(ItemDto.builder().name("Item_4").catalogName("Catalog_2").build());
    }
    
    @GetMapping
    public List<ItemDto> getAll() {
        return itemList;
    }
    
    @GetMapping("/catalogs/{name}")
    public List<ItemDto> getByCatalogName(@PathVariable final String name) {
        return itemList.stream().filter(c -> c.getCatalogName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
}
