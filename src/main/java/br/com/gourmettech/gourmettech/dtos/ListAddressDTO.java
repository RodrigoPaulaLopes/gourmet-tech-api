package br.com.gourmettech.gourmettech.dtos;

import br.com.gourmettech.gourmettech.entities.Address;

public record ListAddressDTO(
    String street,
    String number,
    String city,
    String state,
    String zipCode
) {

    public ListAddressDTO(Address address) {
        this(address.getStreet(), address.getNumber(), address.getCity(), address.getState(), address.getZipCode());
    }
}
