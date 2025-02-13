package br.com.gourmettech.gourmettech.dtos;

import br.com.gourmettech.gourmettech.entities.Restaurant;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record ListRestaurantDTO(
        String id,
        String name,
        ListAddressDTO address,
        ListContactDTO contact) {

    public ListRestaurantDTO(Restaurant restaurant) {
        this(restaurant.getId(),
                restaurant.getName(),
                new ListAddressDTO(restaurant.getAddress()),
                new ListContactDTO(restaurant.getContact()));
    }

}
