package org.vz.spring.cloud.microservices.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.vz.spring.cloud.microservices.dto.ItemDto;

import java.util.List;

@FeignClient("item-service")
public interface ItemClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/api/items/catalogs/{name}")
    List<ItemDto> getByCatalogName(@PathVariable(value = "name") final String name);
}
