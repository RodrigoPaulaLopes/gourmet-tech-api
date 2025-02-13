package br.com.gourmettech.gourmettech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gourmettech.gourmettech.entities.Restaurant;
import br.com.gourmettech.gourmettech.repositories.RestaurantRepository;

@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantRepository restaurantRepository;


    public List<Restaurant> index(){
        return restaurantRepository.findAll();
    }


    public Restaurant create(Restaurant restaurant) {
        var result = restaurantRepository.save(restaurant);
        return result;
    }
}
