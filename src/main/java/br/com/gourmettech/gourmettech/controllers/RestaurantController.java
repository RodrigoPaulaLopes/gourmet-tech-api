package br.com.gourmettech.gourmettech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gourmettech.gourmettech.entities.Restaurant;
import br.com.gourmettech.gourmettech.services.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("/api/v1")
@RestController
public class RestaurantController {
    

    @Autowired
    private RestaurantService restaurantService;


    @GetMapping("/restaurants")
    public ResponseEntity<List<Restaurant>> index() {
        return ResponseEntity.ok().body(restaurantService.index());
    }
}
