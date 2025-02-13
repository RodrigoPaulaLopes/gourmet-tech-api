package br.com.gourmettech.gourmettech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gourmettech.gourmettech.dtos.ListRestaurantDTO;
import br.com.gourmettech.gourmettech.dtos.RestaurantDTO;
import br.com.gourmettech.gourmettech.entities.Restaurant;
import br.com.gourmettech.gourmettech.repositories.RestaurantRepository;

@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantRepository restaurantRepository;


    public List<ListRestaurantDTO> index(){
        return restaurantRepository.findAll().stream().map(ListRestaurantDTO::new).toList();
    }


    public ListRestaurantDTO create(RestaurantDTO restaurant) {
        Restaurant entity = new Restaurant(restaurant);
        var result = restaurantRepository.save(entity);
        return new ListRestaurantDTO(result);
    }
}
