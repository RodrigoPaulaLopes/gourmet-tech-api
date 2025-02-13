package br.com.gourmettech.gourmettech.controllers;

import java.lang.reflect.AccessFlag.Location;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.gourmettech.gourmettech.dtos.ListRestaurantDTO;
import br.com.gourmettech.gourmettech.dtos.RestaurantDTO;
import br.com.gourmettech.gourmettech.entities.Restaurant;
import br.com.gourmettech.gourmettech.services.RestaurantService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RequestMapping("/api/v1/restaurants")
@RestController
public class RestaurantController {
    

    @Autowired
    private RestaurantService restaurantService;


    @GetMapping()
    public ResponseEntity<List<Restaurant>> index() {
        return ResponseEntity.ok().body(restaurantService.index());
    }

    @PostMapping()
    public ResponseEntity<ListRestaurantDTO> postMethodName(@Valid @RequestBody RestaurantDTO restaurant) {
        var result = restaurantService.create(restaurant);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.id()).toUri();
        return ResponseEntity.created(uri).body(result);
    }
    
}
