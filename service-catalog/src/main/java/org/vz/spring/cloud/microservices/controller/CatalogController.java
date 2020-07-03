package org.vz.spring.cloud.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vz.spring.cloud.microservices.client.ItemClient;
import org.vz.spring.cloud.microservices.dto.CatalogDto;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/catalogs", produces = APPLICATION_JSON_VALUE)
public class CatalogController {
    
    private static final List<CatalogDto> catalogList = new ArrayList<>();
    static {
        // Normally the this data would come from a datasource (e.x. database)
        // This project is aimed to demonstrate Spring Cloud capabilities.
        // Therefore the data is hardcoded.
        catalogList.add(CatalogDto.builder().name("Catalog_1").build());
        catalogList.add(CatalogDto.builder().name("Catalog_2").build());
    }
    
    private ItemClient itemClient;
    
    public CatalogController(final ItemClient itemClient) {
        this.itemClient = itemClient;
    }
    
    @GetMapping
    public List<CatalogDto> getAll() {
        catalogList.forEach(c -> c.setItems(itemClient.getByCatalogName(c.getName())));
        return catalogList;
    }
    
    @GetMapping("/{name}")
    public CatalogDto getByName(@PathVariable final String name) {
        return catalogList.stream()
                   .filter(c -> c.getName().equalsIgnoreCase(name))
                   .peek(c -> c.setItems(itemClient.getByCatalogName(c.getName())))
                   .findFirst().get();
    }
}
