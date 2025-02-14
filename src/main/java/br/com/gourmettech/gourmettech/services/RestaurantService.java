package br.com.gourmettech.gourmettech.services;

import java.util.List;

import org.apache.coyote.BadRequestException;
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

    public ListRestaurantDTO show(String id){
        return new ListRestaurantDTO(restaurantRepository.findById(id).get());
    }
    public ListRestaurantDTO create(RestaurantDTO restaurant) {
        Restaurant entity = new Restaurant(restaurant);
        var result = restaurantRepository.save(entity);
        return new ListRestaurantDTO(result);
    }

    public ListRestaurantDTO update(String id, RestaurantDTO restaurant) {

        var rest = restaurantRepository.findById(id).get();
        rest.changeAttr(restaurant);
        restaurantRepository.save(rest);
        return new ListRestaurantDTO(rest);
    }

    public void delete(String id){
        var restaurant = restaurantRepository.findById(id).get();
        restaurantRepository.delete(restaurant);    
    }
}
