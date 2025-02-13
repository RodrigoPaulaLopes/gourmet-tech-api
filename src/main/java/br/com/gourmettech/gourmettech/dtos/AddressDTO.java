package br.com.gourmettech.gourmettech.dtos;

import jakarta.validation.constraints.NotBlank;

public record AddressDTO(
    @NotBlank(message = "Street cannot be blank") String street,
    @NotBlank(message = "Number cannot be blank") String number,
    @NotBlank(message = "City cannot be blank") String city,
    @NotBlank(message = "State cannot be blank") String state,
    @NotBlank(message = "Zip Code cannot be blank") String zipCode
) {}
