package br.com.gourmettech.gourmettech.dtos;

import br.com.gourmettech.gourmettech.entities.Restaurant;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record RestaurantDTO(
    @NotBlank(message = "Restaurant name cannot be blank") @NotEmpty(message = "Restaurant name cannot be blank") String name,
    @Valid AddressDTO address,
    @Valid ContactDTO contact
) {

}
