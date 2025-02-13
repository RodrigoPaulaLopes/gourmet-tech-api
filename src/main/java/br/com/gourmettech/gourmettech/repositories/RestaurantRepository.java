package br.com.gourmettech.gourmettech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gourmettech.gourmettech.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, String> {
    
}
